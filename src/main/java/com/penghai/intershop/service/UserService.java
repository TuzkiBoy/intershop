package com.penghai.intershop.service;

import java.util.List;

import com.penghai.intershop.bo.User;

public interface UserService {
	//ͨ���û�����ѯ�û�
	public User findSameUsername(String username);
}
