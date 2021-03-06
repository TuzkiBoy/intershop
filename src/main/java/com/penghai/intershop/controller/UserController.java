package com.penghai.intershop.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSONObject;
import com.penghai.intershop.bo.User;
import com.penghai.intershop.service.UserService;

@Controller
@Path(value="/user")
public class UserController extends BaseController{
	@Autowired 
	private UserService userService;
	
	@POST
	@Path(value="/register")
	@Consumes("application/json") 
	@Produces(MediaType.APPLICATION_JSON)
	
	public JSONObject userRegister(User user){
		String username = user.getUsername();
		String pwd = user.getPwd();
		String email = user.getEmail();
		String phone = user.getPhone();
		user.setUsername(username);
		user.setPwd(pwd);
		user.setEmail(email);
		user.setPhone(phone);
		JSONObject result= userService.checkRegister(user);
		
		return result; 
	}
	
	@POST
	@Path(value="/login")
	@Consumes("application/json") 
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject userLogin(User user){
		String username = user.getUsername();
		String pwd = user.getPwd();
		user.setUsername(username);
		user.setPwd(pwd);
		JSONObject outcome = userService.checkLogin(user);
		return outcome;
	}
	
}
