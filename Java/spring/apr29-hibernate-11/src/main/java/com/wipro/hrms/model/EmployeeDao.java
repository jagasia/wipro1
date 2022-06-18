package com.wipro.hrms.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeDao {
	private HibernateTemplate ht;
	
	public void setHt(HibernateTemplate ht)
	{
		this.ht=ht;
	}
	
	@Transactional
	public Serializable create(Employee employee) {
//		ht.persist(employee);
		return ht.save(employee);
	}
	
	
	public List<Employee> read() {
		return ht.loadAll(Employee.class);
	}
	public Employee read(Integer id) {
		return ht.get(Employee.class, id);
	}
	
	@Transactional
	public void update(Employee employee) {
		ht.update(employee);
	}
	
	@Transactional
	public void delete(Integer id) {
		Employee e=read(id);
		if(e!=null)
			ht.delete(e);
		else
			System.out.println("Nothing to delete");
	}
	
}
