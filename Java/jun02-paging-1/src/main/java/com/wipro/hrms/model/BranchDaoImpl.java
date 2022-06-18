package com.wipro.hrms.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class BranchDaoImpl {
	public Session retrieveSession()
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		return cfg.buildSessionFactory().openSession();
	}
	
	public void create(Branch branch) {
		//use save method here.		because, a persist method does not allow detached entity.  When we provide id, then it becomes a detached entity
		Session session = retrieveSession();
		Transaction tran = session.beginTransaction();
		session.save(branch);
		tran.commit();
		session.close();
	}
	public List<Branch> read() {
		Session session = retrieveSession();
		Criteria c = session.createCriteria(Branch.class);
		List<Branch> branches= c.list();
		session.close();
		return branches;
	}
	public Branch read(String bid) {
		Session session = retrieveSession();
		Branch branch = session.get(Branch.class, bid);
		session.close();
		return branch;
	}
	public void update(Branch branch) {
		Session session = retrieveSession();		
		Branch temp=read(branch.getBid());
		if(temp!=null)
		{
			temp.setBname(branch.getBname());
			temp.setBcity(branch.getBcity());
			Transaction tran = session.beginTransaction();
			session.update(temp);
			tran.commit();
		}		
		session.close();
	}
	public void delete(String bid) {
		Session session = retrieveSession();
		Branch temp = session.get(Branch.class, bid);
		if(temp!=null)
		{
			Transaction tran = session.beginTransaction();
			session.delete(temp);
			tran.commit();
		}
		session.close();
	}
	
	public List<Branch> retrieveBranchesOfRange(int startIndex, int pageSize)
	{
		Session session = retrieveSession();
		Criteria c = session.createCriteria(Branch.class);
		c.setFirstResult(startIndex);
//		c.setFetchSize(pageSize);
		c.setMaxResults(pageSize);
		List<Branch> result = c.list();
		session.close();
		return result;
	}
	
	public long getBranchesCount()
	{
		Session session = retrieveSession();
		Query q = session.createQuery("select count(b) from Branch b");
		long count=		(long) q.getSingleResult();
		session.close();
		return count;
	}
}
