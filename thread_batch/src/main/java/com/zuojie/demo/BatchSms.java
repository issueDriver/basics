package com.zuojie.demo;

import java.util.ArrayList;
import java.util.List;

import com.zuojie.demo.pojo.User;

class UserSendThread implements Runnable {
	private List<User> listUser;
	public UserSendThread(List<User> listUser) {
		this.listUser=listUser;
	}
	public void run() {
		for (User user : listUser) {
			System.out.println(Thread.currentThread().getName()+","+user.toString());
		}
		System.out.println();
	}
}

public class BatchSms {
	
	public static void main(String[] args) {
		//1.初始化数据
		List<User>initUser=initUser();
		//2.定义每个线程分批发送大小
		int userCount = 2;
		//3.计算每个线程需要分配的数据
		List<List<User>> splitList = ListUtils.splitList(initUser, userCount);
		for (int i = 0; i < splitList.size(); i++) {
			List<User> list = splitList.get(i);
			UserSendThread userSendThread = new UserSendThread(list);
			//4.分配发送
			Thread thread = new Thread(userSendThread,"线程"+i);
			thread.start();
		}
		
	}
	private static List<User> initUser(){
	List<User>users=new ArrayList<User>();
	for (int i = 0; i < 20; i++) {
		users.add(new User("userId"+i, "userName"+i));
	}
		return users;
	}

}
