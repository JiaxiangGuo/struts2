package com.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
/*
 * 继承ActionSupport类
 */
public class Demo3Action extends ActionSupport{
	@Override
	public String execute() throws Exception {
		System.out.println("继承了ActionSupport类");
		return NONE;
	}
}
