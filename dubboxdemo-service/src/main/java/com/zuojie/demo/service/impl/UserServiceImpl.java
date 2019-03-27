package com.zuojie.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zuojie.demo.service.UserService;
/**
 * 
 * @author zuojie
 * @Service这里是需要对外发布的所以要用alibaba的service
 */
@Service
public class UserServiceImpl implements UserService{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "佐杰";
	}

}
