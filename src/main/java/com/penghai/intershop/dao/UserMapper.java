package com.penghai.intershop.dao;


import com.penghai.intershop.bo.User;

public interface UserMapper {
	//�����Ƿ������ͬ�û���
	public int findByUsername(String username);
	
	//��֤�����Ƿ�ʹ��
	public int findByEmail(String email);
	
	//ע���û���Ϣ
	public int insert(User user);
	
}
