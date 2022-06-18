<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="jumbotron text-center">
		<h1>My First Bootstrap Page</h1>
		<p>Resize this responsive page to see the effect!</p>
	</div>


	<div class="row">
		<div class="col-sm-4">
			<h3>Column 1</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
			<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco
				laboris...</p>
		</div>
		<div class="col-sm-4">
			<form:form method="POST" action="/dml" modelAttribute="employee">
				Id:<form:input path="id" class="form-control" />
				First Name:<form:input path="firstName" class="form-control" />
				<form:errors path="firstName" style="color:red" /><br/>
				Last Name:<form:input path="lastName" class="form-control" />
				Salary:<form:input path="salary" class="form-control" /><br/>
				<input type="submit" value="Add" name="add" class="btn btn-success" />&nbsp;
				<input type="submit" value="Update" name="update" class="btn btn-warning" />&nbsp;
				<input type="submit" value="Delete" name="delete" class="btn btn-danger" />&nbsp;
			</form:form>
		</div>
		<div class="col-sm-4">
			<h3>Column 3</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
			<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco
				laboris...</p>
		</div>
	</div>

	<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8">
			<table class="table table-bordered table-striped table-hover">
				<thead><th>Id</th><th>First Name</th><th>Last Name</th><th>Salary</th><th></th></thead>
				<body>
					<c:forEach var="e" items="${employees }">
						<tr>
							<td>${e.id }</td>
							<td>${e.firstName }</td>
							<td>${e.lastName }</td>
							<td>${e.salary }</td>
							<td></td>
						</tr>
					</c:forEach>
				</body>
			</table>
		</div>
		<div class="col-sm-2"></div>
	</div>
</body>
</html>