package com.penghai.intershop.service;

import java.util.List;

import com.penghai.intershop.bo.User;

public interface UserService {
	//通过用户名查询用户
	public User findSameUsername(String username);
}
