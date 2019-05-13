package com.zuojie;
/**
 * 功能描述(死锁)
 * @author zuojie
 *
 */

public class ThreadDemo3 {
	public static void main(String[] args) throws InterruptedException {
		//线程类一定要是一个实例
		ThreadTrain3 thread=new ThreadTrain3();
		//创建线程
		Thread t1=new Thread(thread);
		Thread t2=new Thread(thread);
		t1.start();
		Thread.sleep(100);
		thread.flag=false;
		t2.start();
	}

}
