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
			
			<form:form method="POST" action="/product" modelAttribute="product">
				Id: <form:input path="id" class="form-control" />
				Name: <form:input path="name" class="form-control" />
				Price: <form:input path="price" class="form-control" /><br/>
				<input type="submit" value="Add" class="btn btn-success" name="add" />&nbsp;
				<input type="submit" value="Update" class="btn btn-warning" name="update" />&nbsp;
				<input type="submit" value="Delete" class="btn btn-danger" name="delete" />&nbsp;
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
				<thead>
					<tr>
						<th>Id</th><th>Name</th><th>Price</th><th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="p" items="${products }">
						<tr>
							<td>${p.id }</td>
							<td>${p.name }</td>
							<td>${p.price }</td>
							<td><a class="btn btn-info" href="/select/${p.id }">Select</a>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="col-sm-2"></div>
		
		</div>

</body>
</html>