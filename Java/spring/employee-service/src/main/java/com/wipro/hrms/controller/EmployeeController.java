package com.wipro.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.hrms.entity.Employee;
import com.wipro.hrms.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService es;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return es.create(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> retrieveEmployees() {
		return es.read();
	}
	
	@GetMapping("/employee/{id}")
	public Employee findEmployeeById(@PathVariable("id") Integer id) {
		return es.read(id);
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return es.update(employee);
	}
	
	@DeleteMapping("/employee/{id}")
	public Employee deleteEmployee(@PathVariable("id") Integer id) {
		return es.delete(id);
	}
	
	@GetMapping("/employee/lastName/{lastName}")
	public List<Employee> findEmployeesByLastName(@PathVariable("lastName") String lastName)
	{
		return es.findEmployeesByLastName(lastName);
	}
	
}
