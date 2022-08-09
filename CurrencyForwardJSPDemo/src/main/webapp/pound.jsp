<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pound Page</title>
</head>
<body>
	<%
	int amt = Integer.parseInt(request.getParameter("txtAmount"));
	int ans = amt / 89;
	%>
	<div align="center">
		<h1 style="color:green">Your amount in Pounds : <%=ans%></h1>
	</div>
</body>
</html>