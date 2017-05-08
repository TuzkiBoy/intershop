package com.penghai.intershop.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penghai.intershop.bo.User;
import com.penghai.intershop.dao.UserMapper;
import com.penghai.intershop.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	//通过用户名查询用户
	public User findSameUsername(String username) {
		User users= userMapper.findByUsername(username);
		if(users.getUsername().equals(username)){
			System.out.println("用户名已存在");
			return users;
		} 	
	return null;
	}
}
