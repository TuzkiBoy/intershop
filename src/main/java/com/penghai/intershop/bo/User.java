package com.penghai.intershop.bo;


public class User {
	private Integer id;
	private String username;
	private String pwd;
	private String email;
	private String phone;
	

	
	public Integer getId() {
		return id;
	}
	
	public void SetId(Integer id) {
		this.id=id;
	} 
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username=username;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd=pwd;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
}
