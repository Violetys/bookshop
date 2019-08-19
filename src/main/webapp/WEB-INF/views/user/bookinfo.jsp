<%@page import="beans.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图书详情</title>
</head>
<body>
<% Book book = (Book)session.getAttribute("bookinfo"); %>
<table>
<tr>
<td>图书ISBN</td><td><%=book.getBisbn() %></td>
</tr>
<tr>
<td>图书名称</td><td><%=book.getBname() %></td>
</tr>
<tr>
<td>图书价格</td><td><%=book.getBprice() %></td>
</tr>
<tr>
<td>图书作者</td><td><%=book.getBauthor() %></td>
</tr>
<tr>
<td>图书出版社</td><td><%=book.getBpublisher() %></td>
</tr>
<tr>
<td>图书简介</td><td><%=book.getBintro() %></td>
</tr>
<tr>
<td>图书图片</td>
<%
	if(book.getPhotolist()!=null){
		for(int i=0;i<book.getPhotolist().size();i++){
			%>
			<td></td><td><%=book.getPhotolist().get(i) %></td>
			
			</tr>
			<tr>
			<%
		}
	}
%>
</tr>
<tr>
<td colspan="2"><a href="/BookShop/user/buy/<%=book.getBisbn() %>">购买</a></td>
</tr>
</table>
</body>
</html>