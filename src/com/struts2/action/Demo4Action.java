package com.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.domain.User;

public class Demo4Action extends ActionSupport {

	/**
	 * Struts2封装数据
	 */
	private static final long serialVersionUID = 1L;
	//属性驱动封装成JavaBean
	private User user;
	public User getUser(){
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public String run1(){
		System.out.println(user);
		return null;
	}
	
	//属性驱动，封装数据
	private String username;
	private String password;
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String run2(){
		System.out.println("username:"+username+", password:"+password);
		return null;
	}
}
