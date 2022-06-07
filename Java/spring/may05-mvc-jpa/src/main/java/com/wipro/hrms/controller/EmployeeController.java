package com.wipro.hrms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wipro.hrms.model.Employee;
import com.wipro.hrms.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService es;
	
	@ModelAttribute("employees")
	public List<Employee> getAllEmployees()
	{
		return es.read();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/show")
	public String showEmployeeForm(@ModelAttribute("employee") Employee employee)
	{
		getAllEmployees();
		return "employee";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/dml", params = "add")
	public String addEmployee(@ModelAttribute("employee") @Valid Employee employee, BindingResult br)
	{
		System.out.println("add method is started");
		System.out.println(br.hasErrors());
		if(!br.hasErrors())
		{
			es.create(employee);
		}
		return "employee";
	}
	@RequestMapping(method = RequestMethod.POST, value = "/dml", params = "update")
	public String updateEmployee(@ModelAttribute("employee") Employee employee)
	{
		es.update(employee);
		return "employee";
	}
	@RequestMapping(method = RequestMethod.POST, value = "/dml", params = "delete")
	public String deleteEmployee(@ModelAttribute("employee") Employee employee)
	{
		es.delete(employee.getId());
		return "employee";
	}
	
	
}
