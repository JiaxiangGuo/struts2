package com.struts2.action;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/*
 * 使用原生servlet方法
 */
public class RegisterAction extends ActionSupport {
	public String register(){
		//获取request
		HttpServletRequest request = ServletActionContext.getRequest();
		//之后和servlet一样
		return null;
	}
	
	
	
	
	/**
	 * 完全解耦合，使用servlet的API
	 *//*
	private static final long serialVersionUID = 1L;

	public String register(){
		//获取ActionContext上下文
		ActionContext context = ActionContext.getContext();
		//获取参数
		Map<String, Object> map = context.getParameters();
		//遍历获取数据
		Set<String> keys = map.keySet();
		for (String key : keys) {
			String[] value = (String[]) map.get(key);
			
			System.out.println(key+":"+Arrays.toString(value));
			
		}
		//向request中写入值
		context.put("msg", "request");
		//获取并设置session
		context.getSession().put("msg", "session");
		return null;
	}*/
}
