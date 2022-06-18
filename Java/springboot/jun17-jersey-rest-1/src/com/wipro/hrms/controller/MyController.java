package com.wipro.hrms.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.wipro.hrms.model.Employee;
import com.wipro.hrms.model.EmployeeDao;
import com.wipro.hrms.model.EmployeeDaoImpl;

@Path("/employee")
public class MyController {
	
	List<Employee> empList=new ArrayList<>();
	EmployeeDao edao=new EmployeeDaoImpl();
	
//	@GET
//	@Produces("text/json")
//	public Response home()
//	{
//		return Response.status(200).entity("<p>Hi welcome to our rest api</p>").build();
//	}
	
	@GET
	@Path("/{id}")
	@Produces("text/json")
	public Response emp(@PathParam("id")Integer id)
	{		
		return Response.status(200).entity(edao.read(id)).build();
	}
	
	@GET
	@Produces("text/json")
	public Response emps()
	{
//		empList.add(new Employee(1, "Raja", "Sivakumar", 121212.0f));
//		empList.add(new Employee(2, "Suresh", "kumar", 144433.0f));
//		empList.add(new Employee(3, "Ravi", "Sankar", 1212444.0f));
//		empList.add(new Employee(4, "Abdul", "Raheem", 198888.0f));
//		
		return Response.status(200).entity(edao.read()).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("text/json")
	public Response addEmployee(Employee employee)
	{
		edao.create(employee);
		return Response.status(200).entity(employee).build();	
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("text/json")
	public Response updateEmployee(Employee employee)
	{
		edao.update(employee);
		return Response.status(200).entity(employee).build();	
	}
	
	
	@Produces("text/json")
	@DELETE
	@Path("/{id}")
	public Response deleteEmployee(@PathParam("id") Integer id)
	{
		Employee employee = edao.delete(id);
		return Response.status(200).entity(employee).build();
	}
}
