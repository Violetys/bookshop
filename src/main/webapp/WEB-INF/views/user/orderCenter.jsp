<%@page import="beans.Book"%>
<%@page import="beans.Purchase"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>订单中心</title>
</head>
<body>
<% List<Purchase> purchaseList = (List<Purchase>)session.getAttribute("purchaselist"); %>
<% List<Book> booklist = (List<Book>)session.getAttribute("booklist"); %>
<table>
<tr>
<td>订单编号</td><td>购买图书</td><td>购买数量</td><td>总价</td><td>购买日期</td><td>状态</td>
</tr>
<%
for(int i=0;i<purchaseList.size();i++){
	%>
	<tr>
	<td><%=purchaseList.get(i).getId() %></td>
	<td><%for(int j=0;j<booklist.size();j++) {
			if(booklist.get(j).getBisbn().equals(purchaseList.get(i).getBisbn())){
					%>
					<%=booklist.get(j).getBname() %>
					<%
					break;
			}
		}
			
		%>
		</td>
	<td><%=purchaseList.get(i).getNum() %></td>
	<td><%=purchaseList.get(i).getSum() %></td>
	<td><%=purchaseList.get(i).getTime() %></td>
	<td><%=purchaseList.get(i).getStatus() %></td>
	<td><a href="order/<%=purchaseList.get(i).getId()%>">查看</a></td>
	<%
}
%>
</table>
</body>
</html>