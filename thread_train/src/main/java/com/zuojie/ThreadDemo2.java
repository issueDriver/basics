package com.zuojie;
/**
 * ��������:ģ���̲߳���ȫ����
 * ������߳�ͬʱ����һ��ȫ�ֱ����������ܵ������̵߳ĸ��ţ���ʱ��ͻᷢ���̰߳�ȫ����
 * �̲߳���ȫ������ô���
 * ʹ��synchronized��lock
 * ʹ��sychronized�ؼ��ְ��������Ĵ���
 * ÿ��ֻ���õ�ǰһ���߳�ִ��
 * @author zuojie
 *
 */

public class ThreadDemo2 {
	public static void main(String[] args) {
		//�߳���һ��Ҫ��һ��ʵ��
		ThreadTrain thread=new ThreadTrain();
		//�����߳�
		Thread t1=new Thread(thread);
		Thread t2=new Thread(thread);
		t1.start();
		t2.start();
	}

}
