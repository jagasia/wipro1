package com.wipro.hrms.model;

import java.util.List;

public interface EmployeeDao {

	Employee create(Employee employee);

	List<Employee> read();

	Employee read(Integer id);

	Employee update(Employee employee);

	Employee delete(Integer id);

}