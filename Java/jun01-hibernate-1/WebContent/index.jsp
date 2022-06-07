<%@page import="com.wipro.hrms.model.Department"%>
<%@page import="java.util.List"%>
<%@page import="com.wipro.hrms.model.DepartmentDaoImpl"%>
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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
	$("#ddlDid").change(function(){
		
		var id=$(this).val();
		//alert(id);		//lets call the servlet
		//the servlet should be able to find the department object

        $.ajax({url:"ds?id="+id,success:function(result){
            //alert(result);
            var dept=JSON.parse(result);				//vice versa is JSON.stringify		that converts an object into json string
			$("#divName").html(dept.name);
			var str="";
			var emparr=dept.employees;
			for(var e of emparr)
			{
				str+="<tr>";
				str+="<td>"+e.id+"</td>";
				str+="<td>"+e.firstName+"</td>";
				str+="<td>"+e.lastName+"</td>";				
				str+="</tr>";
			}
			$("#tbody").html(str);
            }, error:function(){
            	$("#tbody").html("");
                }});
		});
});
</script>
</head>
<body>
<select id="ddlDid">
<option>Choose...</option>
	<%
		DepartmentDaoImpl ddao=new DepartmentDaoImpl();
		List<Integer> ids= ddao.getAllDids();
		for(Integer id : ids)
		{
			out.print("<option>");
			out.print(id);
			out.print("</option>");
			
		}
	%>
</select>
<div id="divName"></div>

<div class="row">
	<div class="col-md-2"></div>
	<div class="col-md-8">
	<table class="table table-bordered table-striped table-hover">
	<thead>
			<th>Employee Id</th><th>First Name</th><th>Last Name</th>
	</thead>
	<tbody id="tbody">
		
	</tbody>
</table>
	</div>
	<div class="col-md-2"></div>
</div>
</body>
</html>