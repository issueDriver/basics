package com.zuojie.demo;
/**
 * 功能描述(使用匿名内部类创建线程)
 * @author zuojie
 *
 */

public class ThreadDemo03 {
	public static void main(String[] args) {
		//什么是匿名内部类
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				for (int i = 0; i < 30; i++) {
					System.out.println("子线程,i:"+i);
				}
				
			}
		});
		t1.start();
		for (int i = 0; i < 30; i++) {
			System.out.println("main线程,i:"+i);
		}
		
	}
	

}
