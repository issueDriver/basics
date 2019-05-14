package com.zuojie;
/**
 * 
 * 写入线程
 * @author zuojie
 *
 */
public class InputThread extends Thread{
	public Common common;
	public InputThread(Common common) {
		this.common=common;
	}
	@Override
	public void run() {
		int count=0;
		while(true) {
			synchronized (common) {
				if(common.flag) {
					//当前线程等待 wait();类似于sleep可以让当前线程，从运行状态变为休眠状态
					//wait使用在多线程之间的同步 和synchronied一起使用
					try {
						common.wait();
					}catch(Exception e) {
						
					}
				}
				if(count==0) {
					common.name="zuojie";
					common.sex="男";
				}else {
					common.name="丁凡";
					common.sex="女";
				}
				//实现基数和偶数
				count=(count+1)%2;
				common.flag=true;
				common.notify();
			}
			
		}
	}

}
