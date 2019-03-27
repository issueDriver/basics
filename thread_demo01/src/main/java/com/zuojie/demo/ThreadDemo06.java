package com.zuojie.demo;

/**
 * 线程中join的用法
 * 
 * @author zuojie
 *
 */

public class ThreadDemo06 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 30; i++) {
					System.out.println("子线程，i" + i);
				}
			}
		});
		thread.start();
		// 主线程让子线程先执行完毕 怎么做？
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 30; i++) {
			System.out.println("主线程,i" + i);
		}

	}

}
