package com.struts2.action;

/*
 * Struts2框架使用action类处理用户的请求,需要配置文件.src下struts.xml
 */
public class HelloAction {
	public String sayHello(){
		System.out.println("hello Struts2");
		return "suc";
	}
}
