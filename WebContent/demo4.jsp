<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/Struts2/demo4_run1">
	姓名：<input type="text" name="user.username"/>
	密码：<input type="password" name="user.password"/>
	<input type="submit" value="属性驱动，封装成JavaBean"/>
	</form>
	<form action="/Struts2/demo4_run2">
	姓名：<input type="text" name="username"/>
	密码：<input type="password" name="password"/>
	<input type="submit" value="属性驱动，封装数据"/>
	</form>
	<form action="/Struts2/demo5">
	姓名：<input type="text" name="username"/>
	密码：<input type="password" name="password"/>
	<input type="submit" value="模型驱动，封装数据"/>
	</form>
	<form action="/Struts2/demo6">
	姓名：<input type="text" name="userMap['one'].username"/>
	密码：<input type="password" name="userMap['one'].password"/>
	姓名：<input type="text" name="userMap['two'].username"/>
	密码：<input type="password" name="userMap['two'].password"/>
	姓名：<input type="text" name="userMap['three'].username"/>
	密码：<input type="password" name="userMap['three'].password"/>
	<input type="submit" value="把数据封装到map中"/>
	</form>
</body>
</html>