package com.penghai.intershop.dao;


import com.penghai.intershop.bo.User;

public interface UserMapper {
	//查找是否存在相同用户名
	public int findByUsername(String username);
	
	//验证邮箱是否被使用
	public int findByEmail(String email);
	
	//注册用户信息
	public int insert(User user);
	
}
