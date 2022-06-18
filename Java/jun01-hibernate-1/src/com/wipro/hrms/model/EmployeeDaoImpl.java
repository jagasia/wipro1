package com.wipro.hrms.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDaoImpl {
	public void create(Employee employee) {
		Session session = SessionFactory.retrieveSession();
		Transaction tran = session.beginTransaction();
		session.persist(employee);
		tran.commit();
		session.close();
	}
	public List<Employee> read() {
		Session session = SessionFactory.retrieveSession();
		List<Employee> employees = session.createCriteria(Employee.class).list();
		session.close();
		return employees;
	}
	public Employee read(Integer id) {
		Session session = SessionFactory.retrieveSession();
		Employee employee = session.get(Employee.class, id);		
		session.close();
		return employee;
	}
	public void update(Employee employee) {
		Session session = SessionFactory.retrieveSession();
		Employee temp = read(employee.getId());
		if(temp==null)
			return;
		temp.setFirstName(employee.getFirstName());
		temp.setLastName(employee.getLastName());
		temp.setDepartment(employee.getDepartment());
		Transaction tran = session.beginTransaction();
		session.update(temp);
		tran.commit();
		session.close();
	}
	public void delete(Integer id) {
		Session session = SessionFactory.retrieveSession();
		Employee department = read(id);
		if(department==null)
			return;
		session.delete(department);
		session.close();
	}
	
}
