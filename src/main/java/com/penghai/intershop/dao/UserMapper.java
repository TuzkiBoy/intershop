package com.penghai.intershop.dao;


import com.penghai.intershop.bo.User;

public interface UserMapper {
	public User findByUsername(String username);
	
}
