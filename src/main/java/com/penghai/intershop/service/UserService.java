package com.penghai.intershop.service;


import com.alibaba.fastjson.JSONObject;
import com.penghai.intershop.bo.User;

public interface UserService {
	//��ѯ�û�ע���û��������Ƿ����
	public JSONObject checkRegister(User user);
	
	//�û���¼��֤
	public boolean checkLogin(String username,String pwd);
}
