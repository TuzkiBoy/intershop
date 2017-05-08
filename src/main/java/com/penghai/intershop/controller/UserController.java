package com.penghai.intershop.controller;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.penghai.intershop.bo.User;
import com.penghai.intershop.service.UserService;

@Controller
@Path(value="/user")
public class UserController extends BaseController{
	@Autowired 
	private UserService userService;
	
	@POST
	@Path(value="/login")
	@Consumes("application/json") 
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSameUsername(User user){
		 
		 String username = user.getUsername();
		 String pwd = user.getPwd();
		 user.setUsername(username);
		 user.setPwd(pwd);
		 return Response.status(200).entity(user).build();
		 
		 

	}
}
