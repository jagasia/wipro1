<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hi welcome to My MVC project Home page!<br/>
Welcome ${name }
<br/><br/>

<form action="add">
Number 1: <input type="number" name="no1" /><br/>
Number 2: <input type="number" name="no2" /><br/>
<input type="submit" value="Add" />
</form>

${sum }
<br/>
<a href="showLogin">Login Page</a>
<br/>
${username } <br/>
${password }
</body>
</html>