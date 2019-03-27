package com.zuojie.demo;
/**
 * 通过实现Runnale接口线程的调用
 * @author zuojie
 *
 */

public class ThreadDemo02 {
	public static void main(String[] args) {
		//调用线程
         CreateThreadDemo02 t2=new CreateThreadDemo02();
         Thread thread= new Thread(t2);
         thread.start();
         for (int i = 0; i < 30; i++) {
			System.out.println("主线程  mian"+i);
		}
	}

}
