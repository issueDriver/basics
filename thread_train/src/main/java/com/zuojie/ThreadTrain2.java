package com.zuojie;
/**
 * 功能描述使用同步函数(同步方法)
 * @author zuojie
 *
 */

public class ThreadTrain2 implements Runnable{
	private int count=100;//火车票总数
	
	private Object oj=new Object();

	public void run() {
		while (count > 0) {
			show();
		}
	}
		
		
	public synchronized void show() {
		if (count > 0) {
			try {
				Thread.sleep(40);// 休眠操作(这个是为了更好的复线线程不安全的问题)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "出售第" + (100 - count + 1) + "张票");
			count--;
		}
	}
	

}

