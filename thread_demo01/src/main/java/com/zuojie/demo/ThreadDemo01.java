package com.zuojie.demo;
/**
 * 如何创建多线程
 * @author zuojie
 *
 */

public class ThreadDemo01 {
	/**
	 * 什么是进程 进程是正在执行的应用程序
	 * 什么是线程 线程是一条执行路径，一个独立的执行单元
	 * 什么是多线程 为了提高程序的效率
	 * 创建线程的方式？
	 * 1.使用继承Thread类方式 继承Thread类重写run方法
	 * 2.使用实现Runnabe的方式
	 * 3.使用匿名内部类的方式
	 * 4.callable
	 * 5.线程池创建线程
	 */
	public static void main(String[] args) {
		//1.怎么调用线程
		CreateThreadDemo t1 = new CreateThreadDemo();
		//2.启动线程不是调用run方法 而是调用strat方法
		//3.开启多线程后   代码不会从上往下执行
		t1.start();
		for (int i = 0; i < 30; i++) {
			System.out.println("main,i"+i);
		}
	}
}
