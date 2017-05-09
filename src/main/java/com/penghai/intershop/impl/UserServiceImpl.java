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
	public JSONObject checkRegister(User user) {
 		
 		//1���ж��û����Ƿ���� �����ھ���ʾ�û����ڲ����أ������ڣ���ִ��2
		int isAUser = userMapper.findByUsername(user.getUsername());
		// ���صĽṹ
		JSONObject jsonObject = new JSONObject();
		if(isAUser==0){
			//2����������Ƿ���ڣ����ھ���ʾ�����ظ����������3
			int isAEmail = userMapper.findByEmail(user.getEmail());
			//3��������Ҫ������Ӽ�¼���õ����ص�IDֵ��
	 		if(isAEmail==0){
	 			int result = userMapper.insert(user);
	 			//4����IDֵ����0����ô���سɹ� �����򷵻�ʧ��
	 			if (result>0){
	 				jsonObject.put("success", "0");
	 				jsonObject.put("message", "ע��ɹ�");
	 				return jsonObject;
	 			}else{
	 				jsonObject.put("success", "1");
	 				jsonObject.put("message", "��̨����");
	 				return jsonObject;
	 			}
	 			
	 		}else{
	 			jsonObject.put("success", "2");
 				jsonObject.put("message","�����ظ�");
 				return jsonObject;
	 		}
		}else{
				jsonObject.put("success", "3");
				jsonObject.put("message", "�û����Ѵ���");
				return jsonObject;
		}
	
 		
	}
	
	//�û���¼��֤
	public boolean checkLogin(String username,String pwd){
		//�ж��û����������Ƿ�ƥ�䣬����û������ڲ���������ƥ�䣬��ɹ���¼
		//1.�û�����Ϊ�գ���֤�û��������ݿ��û����Ƿ����
		//2.�û�����ȣ���֤��������ݿ��������Ƿ����
		//3.�û��������������ɹ���¼
		
        if (username!= null) {
        	if(username.equals(username)){
        		if(pwd.equals(pwd)){
        			return true;
        		}else{
        			return false;
        		}
        	}else{
        		return true;
        	}
        }else{
        	return false;
        }
	}
}

