<%@page import="com.demo.constant.CommonConstant"%>
<%@page import="com.demo.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home here</title>
</head>
<body>
	<%
		User user = (User) session.getAttribute(CommonConstant.user);
	%>
	Welcome to
	<%=user.getEmail()%>
</body>
</html>