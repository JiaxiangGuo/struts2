package com.struts2.action;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.domain.User;

public class Demo6Action extends ActionSupport{

	/**
	 * 把数据封装到map中
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, User> userMap= new HashMap<>();
	
	public Map<String, User> getUserMap() {
		return userMap;
	}
	public void setUserMap(Map<String, User> userMap) {
		this.userMap = userMap;
	}
	public String execute(){
		System.out.println(userMap.get("two").getUsername());
		return NONE;
	}
}
