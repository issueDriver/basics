package com.zuojie;

public class ThreadTrain implements Runnable{
	private int count=100;//��Ʊ����
	
	private Object oj=new Object();
	public void run() {
		while(count>0) {
			try {
				Thread.sleep(40);//���߲���(�����Ϊ�˸��õĸ����̲߳���ȫ������)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (oj) {//ͬ�������
				if(count>0) {
				System.out.println(Thread.currentThread().getName()+"���۵�"+(100-count+1)+"��Ʊ");
				count--;
				}	
			}
			
		}
		
	}

}
