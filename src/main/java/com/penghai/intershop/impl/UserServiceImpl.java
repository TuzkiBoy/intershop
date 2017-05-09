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
	
	//通过用户名查询用户
	public JSONObject checkRegister(User user) {
 		
 		//1，判断用户名是否存在 若存在就提示用户存在并返回，不存在，就执行2
		int isAUser = userMapper.findByUsername(user.getUsername());
		// 返回的结构
		JSONObject jsonObject = new JSONObject();
		if(isAUser==0){
			//2，检查邮箱是否存在，存在就提示邮箱重复，否则进行3
			int isAEmail = userMapper.findByEmail(user.getEmail());
			//3，均符合要求就增加记录，得到返回的ID值，
	 		if(isAEmail==0){
	 			int result = userMapper.insert(user);
	 			//4，若ID值大于0，那么返回成功 ，否则返回失败
	 			if (result>0){
	 				jsonObject.put("success", "0");
	 				jsonObject.put("message", "注册成功");
	 				return jsonObject;
	 			}else{
	 				jsonObject.put("success", "1");
	 				jsonObject.put("message", "后台错误");
	 				return jsonObject;
	 			}
	 			
	 		}else{
	 			jsonObject.put("success", "2");
 				jsonObject.put("message","邮箱重复");
 				return jsonObject;
	 		}
		}else{
				jsonObject.put("success", "3");
				jsonObject.put("message", "用户名已存在");
				return jsonObject;
		}
	
 		
	}
	
	//用户登录验证
	public boolean checkLogin(String username,String pwd){
		//判断用户名和密码是否匹配，如果用户名存在并且密码相匹配，则成功登录
		//1.用户名不为空，验证用户名与数据库用户名是否相等
		//2.用户名相等，验证密码和数据库中密码是否相等
		//3.用户名和密码相等则成功登录
		
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

