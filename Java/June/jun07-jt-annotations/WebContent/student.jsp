<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<h1>Student Form</h1>
		<p>Created by Wipro 3 batch!</p>
	</div>

	<div class="row">
		<div class="col-sm-4"></div>
		<div class="col-sm-4">
			<form method="post" action="student" enctype="multipart/form-data">
				Id: <input type="number" name="id" class="form-control" value="${student.id }" />
				Name: <input type="text" name="name" class="form-control" value="${student.name }" />
				Date Of Birth: <input type="date" name="dateOfBirth" class="form-control" value="${student.dateOfBirth }" />
				Picture: <input type="file" name="picture" class="form-control" />
				<br/>
				<input type="submit" name="btn" value="Add" class="btn btn-success" />&nbsp;
				<input type="submit" name="btn"  value="Update" class="btn btn-warning" />&nbsp;
				<input type="submit" name="btn"  value="Delete" class="btn btn-danger" />
			</form>
			<br/>
		</div>
		<div class="col-sm-4"></div>
	</div>

	<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8">
			<table class="table table-bordered table-striped table-hover">
				<thead>
					<th>Id</th><th>Name</th><th>Date Of Birth</th><th>Picture</th><th></th>
				</thead>
				<tbody>
					<c:forEach var="s" items="${students }">
						<tr>
							<td>${s.id }</td>
							<td>${s.name }</td>
							<td>${s.dateOfBirth }</td>
							<td>
								<img width="80" src="data:image/png;base64,${s.picture1 }" />
							</td>
							<td>
								<a class="btn btn-info" href="select?id=${s.id }">Select</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="col-sm-2"></div>
	</div>
</body>
</html>