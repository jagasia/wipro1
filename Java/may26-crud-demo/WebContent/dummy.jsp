<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%=(20*20) %><br/>

<%=new java.util.Date() %>
<br/>

<%=20 %>
<br/>
<%
	Map
	for(int i=0;i<10;i++)
	{
		out.print(i+"<br/>");
	}


%>
</body>
</html>