package com.zuojie.demo;

/**
 * xu
 * 
 * @author zuojie
 *
 */

public class ThreadDemo07 {

	public static void main(String[] args) {
		final Thread t1 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println("T1,i:" + i);
				}
			}
		});
		t1.start();
		final Thread t2 = new Thread(new Runnable() {

			public void run() {
				try {
					t1.join();
				} catch (Exception e) {
					// TODO: handle exception
				}
				for (int i = 0; i < 20; i++) {
					try {
						Thread.sleep(30);
					} catch (Exception e) {
						// TODO: handle exception
					}
					System.out.println("T2,i:" + i);
				}
			}
		});

		t2.start();
		Thread t3 = new Thread(new Runnable() {

			public void run() {
				try {
					t2.join();
				} catch (Exception e) {
					// TODO: handle exception
				}
				for (int i = 0; i < 20; i++) {
					try {
						Thread.sleep(30);
					} catch (Exception e) {
						// TODO: handle exception
					}
					System.out.println("T3,i:" + i);
				}
			}
		});

		t3.start();
	}
}
