package com.wipro.hrms.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDaoImpl implements EmployeeDao {
//	private List<Employee> employeeList=new ArrayList<Employee>();
	
	public Session getSession()
	{
		Configuration config= new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		return sf.openSession();
	}
	
	@Override
	public void create(Employee employee) {
//		employeeList.add(employee);
		Session session = getSession();
		Transaction tran = session.beginTransaction();
		session.persist(employee);
		tran.commit();
		session.close();
	}
	@Override
	public List<Employee> read() {
//		return employeeList;
		List<Employee> employees=new ArrayList<>();
		Session session = getSession();
		employees=session.createCriteria(Employee.class).list();
		session.close();
		return employees;
	}
	@Override
	public Employee read(Integer id) {
//		Employee employee=null;
//		for(Employee e : employeeList)
//		{
//			if(e.getId().equals(id))
//			{
//				employee=e;
//				break;
//			}
//		}
//		return employee;
		Session session = getSession();
		Employee e=null;
		e= (Employee) session.get(Employee.class, id);
		session.close();
		return e;
	}
	@Override
	public Employee update(Employee employee) {
//		Employee temp=null;
//		for(Employee e : employeeList)
//		{
//			if(e.getId().equals(employee.getId()))
//			{
//				e=employee;
//				break;
//			}
//		}
//		return temp;
		Employee e=null;
		Session session = getSession();
		Transaction tran = session.beginTransaction();
		e=read(employee.getId());
		if(e!=null)
		{
			e.setFirstName(employee.getFirstName());
			e.setLastName(employee.getLastName());
			e.setSalary(employee.getSalary());
			session.update(e);
		}
		tran.commit();
		session.close();
		return e;
	}
	@Override
	public Employee delete(Integer id) {
//		Employee employee=null;
//		Iterator<Employee> it = employeeList.iterator();
//		while(it.hasNext())
//		{
//			Employee temp = it.next();
//			if(temp.getId().equals(id))
//			{
//				employee=temp;
//				it.remove();
//				break;
//			}
//		}
//		return employee;
		Employee e=null;
		Session session = getSession();
		Transaction tran = session.beginTransaction();
		e=read(id);
		if(e!=null)
		{
			session.delete(e);
		}
		tran.commit();
		session.close();
		return e;
	}
	
}
