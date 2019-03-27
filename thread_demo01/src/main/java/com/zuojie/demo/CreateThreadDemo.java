package com.zuojie.demo;
/**
 * 使用继承的方式创建多线程
 * @author zuojie
 *
 */

public class CreateThreadDemo extends Thread{
    /**
     * run方法就是线程需要执行的任务或者是程序需要执行的方法
     */
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("run,i"+i);
		}
	}

}
