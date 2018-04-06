package com.struts2.action;
/*
 * POJO类，不继承，不实现接口，简单类
 */
public class Demo1Action {
	public String execute(){
		System.out.println("这是一个POJO类");
		return null;
	}
}
