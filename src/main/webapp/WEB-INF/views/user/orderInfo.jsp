<%@page import="beans.Book"%>
<%@page import="java.util.List"%>
<%@page import="beans.Purchase"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>订单详情</title>
</head>
<body>
	<%
		Purchase purchase = (Purchase) session.getAttribute("purchaseinfo");
	%>
	<%
		List<Book> booklist = (List<Book>) session.getAttribute("booklist");
	%>
	<%
		Book book = new Book();
		for (int i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).getBisbn().equals(purchase.getBisbn())) {
				book = booklist.get(i);
				break;
			}
		}
	%>
	<table>
		<tr>
			<td>订单编号</td>
			<td><%=purchase.getId()%></td>
		</tr>
		<tr>
			<td>图书编号</td>
			<td><%=purchase.getBisbn()%></td>
		</tr>
		<tr>
			<td>图书名称</td>
			<td><%=book.getBname() %></td>
		</tr>
		<tr>
			<td>出版社</td>
			<td><%=book.getBpublisher() %></td>
		</tr>
		<tr>
			<td>作者</td>
			<td><%=book.getBauthor() %></td>
		</tr>
		<tr>
			<td>购买数量</td>
			<td><%=purchase.getNum() %></td>
		</tr>
		<tr>
			<td>总金额</td>
			<td><%=purchase.getSum() %></td>
		</tr>
		<tr>
			<td>购买日期</td>
			<td><%=purchase.getTime() %></td>
		</tr>
		<tr>
			<td>状态</td>
			<td><%=purchase.getStatus() %></td>
		</tr>
	</table>
</body>
</html>