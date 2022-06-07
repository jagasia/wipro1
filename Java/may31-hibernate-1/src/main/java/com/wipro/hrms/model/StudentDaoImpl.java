package com.wipro.hrms.model;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class StudentDaoImpl {
	
	public Session retrieveSession()
	{
		//create an object representation of the configuration class
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
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
	public List<Student> read() {
		Session session = retrieveSession();
		Criteria c = session.createCriteria(Student.class);
		List<Student> students = c.list();
		return students;
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
		if(temp==null)
			return;
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
	
	public List<Student> findByName(String name)
	{
		Session session = retrieveSession();
		Criteria c = session.createCriteria(Student.class);
		c.add(Restrictions.eq("name", name));
		List<Student> students = c.list();
		return students;
	}
	
	public List<Student> findStudentsByDob(Date dob)
	{
		Session session = retrieveSession();
		Criteria c = session.createCriteria(Student.class);
		c.add(Restrictions.lt("dateOfBirth", dob));
		List<Student> students = c.list();
		return students;
	}
	
}
