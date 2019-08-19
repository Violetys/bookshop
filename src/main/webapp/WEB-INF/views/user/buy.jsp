<%@page import="beans.Useraddr"%>
<%@page import="java.util.List"%>
<%@page import="beans.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
Book book = (Book)session.getAttribute("buybook");
List<Useraddr> addrlist = (List<Useraddr>)session.getAttribute("addrlist");
%>

<form action="/BookShop/user/buybook" method="post">
<table>
<tr>
<td>书名</td><td><%=book.getBname() %></td>
</tr>
<tr>
<td>书ISBN编号</td><td><%=book.getBisbn() %></td>
</tr>
<tr>
<td>出版社</td><td><%=book.getBpublisher() %></td>
</tr>
<tr>
<td>作者</td><td><%=book.getBauthor() %></td>
</tr>
<tr>
<td>购买数量</td><td><input type="text" name="num"></td>
</tr>
<tr>
<td>收货地址</td>
<td>
<select name="addid">
	<%
	for(int i=0;i<addrlist.size();i++){
		%>
		<option value=<%=addrlist.get(i).getId() %>>
			<%=addrlist.get(i).getUaddress() %>
		</option>
		<%
	}
	%>
</select>
</td>
</tr>
<tr>
<td>购买</td><td><input type="submit" value="购买"></td>
</tr>
</table>
</form>
</body>
</html>