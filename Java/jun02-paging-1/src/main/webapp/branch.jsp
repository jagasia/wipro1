<%@page import="com.wipro.hrms.model.BranchDaoImpl" isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
<%
	BranchDaoImpl bdao=new BranchDaoImpl();
	long count=bdao.getBranchesCount();
	int pageSize=5;
	int noOfPages=((int)count/pageSize)+1;
	for(int i=1;i<=noOfPages;i++)
	{
		out.print("<a href=\"branch?pageNo="+i+"\">"+i+"</a>&nbsp;&nbsp;");
	}
%>

<%-- <c:if test="${branches} ne null"> --%>
<table class="table table-bordered table-striped table-hover">
	<thead>
		<th>Bid</th><th>BName</th><th>BCity</th>
	</thead>
	<tbody>
		<c:forEach var="b" items="${branches }">
			<tr>
					<td>${b.bid }</td>
					<td>${b.bname }</td>
					<td>${b.bcity }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<%-- </c:if> --%>
</body>
</html>