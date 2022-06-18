<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script>
	function comparePasswords()
	{
		var password=$("#password").val();
		var cpassword=$("#cpassword").val();
		if(password!=cpassword)
		{
			$("#pwdError").css("display","inline");
		}else
		{
			$("#pwdError").css("display","none");
		}
	}
		$(document).ready(function(){
			$("#cpassword").blur(function(){
				comparePasswords();			
			});

			$("#cpassword").keyup(function(){
				comparePasswords();			
			});
			$("#password").keyup(function(){
				comparePasswords();			
			});
			$("#password").blur(function(){
				comparePasswords();			
			});			
		});
	</script>
</head>
<body>
	<jsp:include page="nav.jsp" />
	<jsp:include page="header.jsp" />

	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				<h3>Column 1</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
				<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco
					laboris...</p>
			</div>
			<div class="col-sm-4">
			<h3 class="text-center">Signup Form</h3>
				<form:form method="post" action="addCustomer" modelAttribute="customer">
					Id:<div>
					<form:input type="text" class="form-control" name="id" path="id" />
					<span class="text-danger">
						<form:errors path="id" />
					</span>
					</div> 
					Password:<form:input type="password" class="form-control" name="password" id="password"  path="password" required="required" />
					Confirm Password:<div>
					<input type="password" class="form-control" name="cpassword" id="cpassword" />
					<span id="pwdError" class="text-danger">
						Passwords does not match
					</span>
					</div> 
					FirstName:<form:input type="text" class="form-control" name="firstName" path="firstName" />
					LastName:<form:input type="text" class="form-control" name="lastName" path="lastName" />
					DateOfBirth:<form:input type="date" class="form-control" name="dateOfBirth" path="dateOfBirth" />
					Email:<form:input type="email" class="form-control" name="email" path="email" />
					Contact:<form:input type="text" class="form-control" name="contact" path="contact" />
					<span class="text-danger">
						<form:errors path="contact" />
					</span> <br/>
					<input type="submit" value="Sign Up" class="btn btn-success" />&nbsp;&nbsp;<input type="reset" class="btn btn-warning" />				
				</form:form>
				<br/><br/><br/><br/><br/><br/><br/>
				
			</div>
			<div class="col-sm-4">
				<h3>Column 3</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
				<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco
					laboris...</p>
			</div>
		</div>
	</div>
</body>
</html>