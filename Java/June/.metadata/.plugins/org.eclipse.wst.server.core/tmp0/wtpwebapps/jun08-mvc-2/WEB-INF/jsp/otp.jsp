<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="validateOtp">
	<h3>We have sent an OTP to your email ${email }</h3>
		Enter the OTP: <input type="number" name="otp" /> <input
			type="submit" value="Submit" />
	</form>
</body>
</html>