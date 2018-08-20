<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="model.Student,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%
		ArrayList<Student> st = (ArrayList<Student>)request.getAttribute("s");
	%>
	
<h2>The si	<%= st.size() %></h2>
	<table>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Address</th>
	</tr>
		<%for(Student s : st){ %>
		<tr>
			<td><%=s.getId() %> </td>
			<td><%=s.getName() %></td>
			<td><%=s.getAddress() %></td>
		</tr>
		<% } %>
	</table>
</body>
</html>