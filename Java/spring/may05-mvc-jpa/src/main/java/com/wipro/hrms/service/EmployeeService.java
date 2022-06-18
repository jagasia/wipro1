package com.wipro.hrms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.hrms.model.Employee;
import com.wipro.hrms.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository er;
	
	public Employee create(Employee employee) {
		return er.save(employee);
	}
	public List<Employee> read() {
		return er.findAll();
	}
	public Employee read(Integer id) {
		Optional<Employee> x = er.findById(id);
		Employee employee=null;
		if(x.isPresent())
		{
			employee=x.get();
		}
		return employee;
	}
	public Employee update(Employee employee) {
		return er.save(employee);
	}
	public Employee delete(Integer id) {
		Employee employee = read(id);
		if(employee!=null)
		{
			er.delete(employee);
		}
		return employee;
	}
	
}
