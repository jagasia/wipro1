<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="calc">
Number 1: <input type="number" name="no1" value="${param.no1 }" /><br/>
Number 2: <input type="number" name="no2" value="${param.no2 }" /><br/>
<input type="submit"  value="Add" />
</form>
<br/>
${output }
</body>
</html>