package com.wipro.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.wipro.hrms.model.Employee;
import com.wipro.hrms.model.EmployeeDao;

//@EnableWebMvc
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeDao edao;
	
	@GetMapping
	public List<Employee> retrieveAllEmployees()
	{
		return edao.read();
	}
	
	@GetMapping("/{id}")
	public Employee findEmployeeById(@PathVariable("id") Integer id)
	{
		return edao.read(id);
	}
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return edao.create(employee);
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return edao.update(employee);
	}
	
	@DeleteMapping("/{id}")
	public Employee deleteEmployee(@PathVariable("id")Integer id)
	{
		return edao.delete(id);
	}
}