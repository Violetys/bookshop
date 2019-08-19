<%@page import="beans.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查询详情</title>
</head>
<body>
	<%
		List<Book> booklist = (List<Book>) session.getAttribute("booklistsearch");
		int f = 0;
	%>
	<table>
		<%
			if (booklist != null) {
		%>
		<tr>
			<%
				for (int i = 0; i < booklist.size(); i++) {
			%>
			<td>
				<table>
					<tr>
						<td colspan="2"><%=booklist.get(i).getBname()%></td>
					</tr>
					<tr>
						<td colspan="2"><%=booklist.get(i).getPhotolist().get(0)%></td>
					</tr>
					<tr>
						<td><%=booklist.get(i).getBprice()%></td>
						<td><a href="getinfo/<%=booklist.get(i).getBisbn()%>">查看</a></td>
					</tr>
				</table>
			</td>
			<%
				f++;
						if (f % 5 == 0) {
			%>
		</tr>
		<tr>
			<%
				}
			%>
			<%
				}
			%>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>