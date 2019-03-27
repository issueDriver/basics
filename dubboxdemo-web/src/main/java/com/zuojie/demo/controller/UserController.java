package com.zuojie.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zuojie.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	/**
	 * Reference这里用这个注解是应为这个接口的实现是在远端实现的
	 */
	@Reference
	private UserService userservice;
	
	@RequestMapping("/showName")
	@ResponseBody
	public String showName() {
		return userservice.getName();
	}

}
