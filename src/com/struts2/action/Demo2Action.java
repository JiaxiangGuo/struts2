package com.struts2.action;

import com.opensymphony.xwork2.Action;

/*
 * 实现Action接口,框架提供的
 */
public class Demo2Action implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println("实现了Action接口");
		return SUCCESS;
	}

}
