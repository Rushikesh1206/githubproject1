<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head> 
<body>
	<%
	String choice = request.getParameter("radCurrency");
	String pageUrl = "";
	
	switch(choice) {
		case "d":
				pageUrl = "dollar.jsp";
				break;
		case "p":
				pageUrl = "pound.jsp";
				break;		
	}
	%>
	
	<jsp:forward page="<%=pageUrl%>"></jsp:forward>
</body>
</html>