<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="calculate">
	Number 1: <input type="number" name="no1" value="${no1 }" /><br/>
	Number 2: <input type="number" name="no2" value="${no2 }" /><br/>
	<input type="submit" value="Add" name="add" />
	<input type="submit" value="Subtract" name="subtract" />
	<input type="submit" value="Multiply" name="multiply" />
</form>
${result }
</body>
</html>