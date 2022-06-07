package com.wipro.hrms;

import com.wipro.hrms.model.Department;
import com.wipro.hrms.model.DepartmentDaoImpl;
import com.wipro.hrms.model.Employee;
import com.wipro.hrms.model.EmployeeDaoImpl;
import com.wipro.hrms.model.SessionFactory;

public class App {

	public static void main(String[] args) {
		DepartmentDaoImpl ddao=new DepartmentDaoImpl();
		
		Department d = ddao.read(46);
		System.out.println("displaying the employees present in the department");
		for(Employee e:d.getEmployees())
		{
			System.out.println(e);
		}
		
//		Department d=new Department();
//		d.setId(49);
//		d.setName("Computer Science");
//		
//		ddao.create(d);
//		ddao.update(d);
//		ddao.delete(49);
//		EmployeeDaoImpl edao=new EmployeeDaoImpl();
//		Employee employee=new Employee();
//		employee.setFirstName("Jagadees");
//		employee.setLastName("waran");
//		Department department = ddao.read(46);
//		employee.setDepartment(department);
//		
//		
//		edao.create(employee);
		
		System.out.println("Hello world");
	}

}
