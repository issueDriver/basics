package com.zuojie.demo;
/**
 * 功能描述（线程常用的API）
 * @author Administrator
 *
 */
class CreateThread05 extends Thread {
	//getId() 线程id 唯一，不会重复
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("线程id"+getId()+"子线程,i"+i+"name:"+getName());
			if(i==5) {
				stop();//不安全，不建议大家使用
			}
		}
	}
}
public class ThreadDemo04 {
	public static void main(String[] args) {
		//获取主线程id
		//任何一个程序肯定有一个主线程
		System.out.println("主线程"+Thread.currentThread().getId()+",name:"+Thread.currentThread().getName());
		for (int i = 0; i < 3; i++) {
			CreateThread05 t1 = new CreateThread05();
			t1.start();
		}
	}

}
