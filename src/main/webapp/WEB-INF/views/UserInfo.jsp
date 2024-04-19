<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Information</title>
</head>
<body>
<%
	String userName = (String)request.getAttribute("username");
	Integer rank = (Integer)request.getAttribute("rank");
	String country = (String)request.getAttribute("country");

%>
<table>
<tr>
<td>Name</td>
<td>Rank</td>
<td>Country</td>
</tr>
<tr>
<td><%=userName%></td>
<td><%=rank %></td>
<td><%=country %></td>
</tr>

</table>
</body>
</html>