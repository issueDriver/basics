package com.zuojie.demo;
/**
 * 通过实现Runnable的方式来创建线程
 * @author zuojie
 *
 */

public class CreateThreadDemo02 implements Runnable{
    //run方法就是线程需要执行的任务或者是程序需要执行的方法
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("子线程 run,i:"+i);
		}
		
	}

}
