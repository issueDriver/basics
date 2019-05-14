package com.zuojie;
/**
 * 读取线程
 * @author zuojie
 *
 */
public class OutputThread extends Thread{
	public Common common;
	public OutputThread(Common common) {
		this.common=common;
	}
	@Override
	public void run() {
		while(true) {
			synchronized (common) {
				if(!common.flag) {
					try {
						common.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(common.name + "------" + common.sex);
				common.flag=false;
				common.notify();
			}
		}
		
	}

}
