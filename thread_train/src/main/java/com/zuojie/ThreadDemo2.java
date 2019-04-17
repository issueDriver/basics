package com.zuojie;
/**
 * 功能描述:模拟线程不安全问题
 * 当多个线程同时共享一个全局变量，可能受到其他线程的干扰，这时候就会发生线程安全问题
 * 线程不安全问题怎么解决
 * 使用synchronized和lock
 * 使用sychronized关键字包裹起来的代码
 * 每次只能让当前一个线程执行
 * @author zuojie
 *
 */

public class ThreadDemo2 {
	public static void main(String[] args) {
		//线程类一定要是一个实例
		ThreadTrain thread=new ThreadTrain();
		//创建线程
		Thread t1=new Thread(thread);
		Thread t2=new Thread(thread);
		t1.start();
		t2.start();
	}

}
