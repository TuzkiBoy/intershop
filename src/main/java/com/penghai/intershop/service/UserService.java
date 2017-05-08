package com.penghai.intershop.service;


import com.penghai.intershop.bo.User;

public interface UserService {
	//查询用户注册用户名邮箱是否存在
	public User findSameInfo(User user);
	

}
