package com.zuojie;
/**
 * ��������(����)
 * @author zuojie
 *
 */

public class ThreadDemo3 {
	public static void main(String[] args) throws InterruptedException {
		//�߳���һ��Ҫ��һ��ʵ��
		ThreadTrain3 thread=new ThreadTrain3();
		//�����߳�
		Thread t1=new Thread(thread);
		Thread t2=new Thread(thread);
		t1.start();
		Thread.sleep(100);
		thread.flag=false;
		t2.start();
	}

}
