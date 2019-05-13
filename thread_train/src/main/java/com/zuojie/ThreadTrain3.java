package com.zuojie;
/**
 * 
 * @author zuojie
 *
 */

public class ThreadTrain3 implements Runnable{
	private int count=100;
	
	private Object oj=new Object();
	
	public boolean flag=true;

	public void run() {
		if (flag) {
			while (count > 0) {
				//锁一般代码执行完毕之后，锁会自动释放掉，让其他线程拿到锁执行
				//如果flag为true 先拿到oj这把锁，再拿this锁 才能执行代码
				//如果flag为false 先拿到this这把锁 再拿obj这把锁 才能执行代码
				synchronized (oj) {
					show();
				}
			}
		} else {
			
			while (count > 0) {
				show();
			}
		}
	}
		
	public synchronized void show() {//同步锁
		//嵌套同步锁
		synchronized (oj) {
			if (count > 0) {
				try {
					Thread.sleep(40);// 
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "出售第" + (100 - count + 1) + "张票");
				count--;
			}
		}
	}
	

}

