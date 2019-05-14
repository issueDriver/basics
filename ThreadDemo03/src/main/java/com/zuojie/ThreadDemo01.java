package com.zuojie;

public class ThreadDemo01 {
	public static void main(String[] args) {
		Common commo=new Common();
		InputThread input= new InputThread(commo);
		OutputThread output = new OutputThread(commo);
		input.start();
		output.start(); 
		
		
	}

}
