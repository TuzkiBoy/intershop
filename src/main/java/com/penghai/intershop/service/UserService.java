package com.penghai.intershop.service;


import com.alibaba.fastjson.JSONObject;
import com.penghai.intershop.bo.User;

public interface UserService {
	//查询用户注册用户名邮箱是否存在
	public JSONObject checkRegister(User user);
	
	//用户登录验证
	public boolean checkLogin(String username,String pwd);
}
