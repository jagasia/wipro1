package com.wipro.hrms.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
	private List<Employee> employeeList=new ArrayList<Employee>();
	
	@Override
	public void create(Employee employee) {
		employeeList.add(employee);
	}
	@Override
	public List<Employee> read() {
		return employeeList;
	}
	@Override
	public Employee read(Integer id) {
		Employee employee=null;
		for(Employee e : employeeList)
		{
			if(e.getId().equals(id))
			{
				employee=e;
				break;
			}
		}
		return employee;
	}
	@Override
	public Employee update(Employee employee) {
		Employee temp=null;
		for(Employee e : employeeList)
		{
			if(e.getId().equals(employee.getId()))
			{
				e=employee;
				break;
			}
		}
		return temp;
	}
	@Override
	public Employee delete(Integer id) {
		Employee employee=null;
		Iterator<Employee> it = employeeList.iterator();
		while(it.hasNext())
		{
			Employee temp = it.next();
			if(temp.getId().equals(id))
			{
				employee=temp;
				it.remove();
				break;
			}
		}
		return employee;
	}
	
}