package com.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts2.domain.User;
//模型驱动封装数据
public class Demo5Action extends ActionSupport implements ModelDriven<User>{
	private User user = new User();

	@Override
	public User getModel() {
		return user;
	}
	public String execute(){
		System.out.println(user);
		return NONE;
	}
}
