package com.wipro.abcd.model;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class StudentDaoImpl {
	
	public Session retrieveSession()
	{
		//create an object representation of the configuration class
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		return sf.openSession();
	}
	
	public void create(Student student) {
		Session session = retrieveSession();
		Transaction tran = session.beginTransaction();
		session.persist(student);
		tran.commit();
		session.close();
	}
	public void read() {
		
	}
	public Student read(Integer id) {
		Session session = retrieveSession();
		Student student=(Student) session.get(Student.class, id);
		return student;
	}
	public void update(Student student) {
		Session session = retrieveSession();
		Transaction tran = session.beginTransaction();
		//find the existing row and persist it
//		Student temp = (Student) session.get(Student.class, student.getId());		//	get method is used to find by primary key
			//temp is a managed entity. 			student is a detached entity
		Student temp = read(student.getId());
		temp.setName(student.getName());
		temp.setDateOfBirth(student.getDateOfBirth());
//		session.persist(temp);
//		session.save(temp);
		session.update(temp);
		tran.commit();
		session.close();
	}
	public void delete(Integer id) {
		Session session = retrieveSession();
		Transaction tran = session.beginTransaction();
		Student temp = read(id);	
		session.delete(temp);
		tran.commit();
		session.close();
	}
	
	
}
