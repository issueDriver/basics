package com.zuojie.demo;

/**
 * 用户线程 是主线程创建的线程 非守护线程
 * 
 * @author zuojie
 *
 */

public class ThreadDemo05 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 30; i++) {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("子线程,i:" + i);
				}
			}
		});
		t1.setDaemon(true);// 该线程 是守护线程 和主线程一起销毁
		t1.start();
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("主线程,i:" + i);
		}
		System.out.println("主线程执行完毕。。。。。");
	}

}
