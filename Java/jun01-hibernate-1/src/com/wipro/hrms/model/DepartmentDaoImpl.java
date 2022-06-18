package com.wipro.hrms.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class DepartmentDaoImpl {
	
	
	public void create(Department department) {
		Session session = SessionFactory.retrieveSession();
		Transaction tran = session.beginTransaction();
		session.persist(department);
		tran.commit();
		session.close();
	}
	public List<Department> read() {
		Session session = SessionFactory.retrieveSession();
		Criteria c = session.createCriteria(Department.class);
		List<Department> departments = c.list();
		session.close();
		return departments;
	}
	public Department read(Integer id) {
		Session session = SessionFactory.retrieveSession();
		Department department = session.get(Department.class, id);
		session.close();
		return department;
	}
	public void update(Department department) {
		Department temp = read(department.getId());
		if(temp==null)
			return;
		Session session = SessionFactory.retrieveSession();
		Transaction tran = session.beginTransaction();
		
		temp.setName(department.getName());
		session.update(temp);
		tran.commit();
		session.close();
	}
	public void delete(Integer id) {
		Department temp=read(id);
		if(temp==null)
			return;
		Session session = SessionFactory.retrieveSession();
		Transaction tran = session.beginTransaction();
		session.delete(temp);
		tran.commit();
		session.close();
	}
	
	public List<Integer> getAllDids()
	{
		Session session = SessionFactory.retrieveSession();
		Query q = session.createQuery("select distinct d.id from Department d order by d.id");
	
		List<Integer> ids=q.list();		
		session.close();
		return ids;
	}
	
}
