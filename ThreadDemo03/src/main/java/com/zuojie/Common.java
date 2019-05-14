package com.zuojie;
/**
 * 共享资源
 * @author zuojie
 *
 */
public class Common {
	public String name;
	
	public String sex;
	//flag为true表示common已经读取值，flag为false out线程未读取值
	public boolean flag=false;

}
