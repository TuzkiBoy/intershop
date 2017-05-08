package com.penghai.intershop.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.penghai.intershop.bo.User;
import com.penghai.intershop.dao.UserMapper;
import com.penghai.intershop.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	//ͨ���û�����ѯ�û�
	public JSONObject findSameInfo(User user) {
 		
 		//1���ж��û����Ƿ���� �����ھ���ʾ�û����ڲ����أ������ڣ���ִ��2
		int isAUser = userMapper.findByUsername(user.getUsername());
		if(isAUser==0){
			//2����������Ƿ���ڣ����ھ���ʾ�����ظ����������3
			int isAEmail = userMapper.findByEmail(user.getEmail());
			//3��������Ҫ������Ӽ�¼���õ����ص�IDֵ��
	 		if(isAEmail==0){
	 			int result = userMapper.insert(user);
	 			if (result>0){
	 				
	 			}else{
	 				return 
	 			}
	 			
	 		}else{
	 			return new JSONObject();
	 		}
	 		//4����IDֵ����0����ô���سɹ� �����򷵻�ʧ��
			
		}else{
			return new JSONObject();
		}
 		
 		
 		
 		
	}
}

