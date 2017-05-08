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
	public JSONObject findSameInfo(User user) {
 		
 		//1，判断用户名是否存在 若存在就提示用户存在并返回，不存在，就执行2
		int isAUser = userMapper.findByUsername(user.getUsername());
		if(isAUser==0){
			//2，检查邮箱是否存在，存在就提示邮箱重复，否则进行3
			int isAEmail = userMapper.findByEmail(user.getEmail());
			//3，均符合要求就增加记录，得到返回的ID值，
	 		if(isAEmail==0){
	 			int result = userMapper.insert(user);
	 			if (result>0){
	 				
	 			}else{
	 				return 
	 			}
	 			
	 		}else{
	 			return new JSONObject();
	 		}
	 		//4，若ID值大于0，那么返回成功 ，否则返回失败
			
		}else{
			return new JSONObject();
		}
 		
 		
 		
 		
	}
}

