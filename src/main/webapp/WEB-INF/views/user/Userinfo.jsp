<%@page import="beans.Userinfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>个人信息</title>
</head>
<body>
	<%
		Userinfo userinfo = (Userinfo) session.getAttribute("userinfo");
	%>
	<table>
		<tr>
			<td>昵称</td>
			<td><%=userinfo.getUnickname() %></td>
		</tr>
		<tr>
			<td>真实姓名</td>
			<td><%=userinfo.getUtruename() %></td>
		</tr>
		<tr>
			<td>电话</td>
			<td><%=userinfo.getUphone() %></td>
		</tr>
		<tr>
			<td>头像</td>
			<td><%=userinfo.getUphoto() %></td>
		</tr>
		<tr>
			<td>性别</td>
			<td><%=userinfo.getUsex() %></td>
		</tr>
	</table>
</body>
</html>