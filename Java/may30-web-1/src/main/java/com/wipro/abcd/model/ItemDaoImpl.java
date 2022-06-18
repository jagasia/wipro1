package com.wipro.abcd.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class ItemDaoImpl {
	public Session retrieveSession()
	{
		//create an object representation of the configuration class
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		return sf.openSession();
	}
	
	public List<String> retrieveCategories()
	{
		Session session = retrieveSession();
		Query q = session.createQuery("select distinct i.category from Item i order by i.category");
		List<String> categories = q.list();
		session.close();
		return categories;
	}
	
	public void create(Item item) {
		Session session = retrieveSession();
		Transaction tran = session.beginTransaction();
		session.persist(item);
		tran.commit();
		session.close();
	}
	public List<Item> read() {
		Session session = retrieveSession();
		Criteria c = session.createCriteria(Item.class);
		return c.list();
	}
	public Item read(Integer id) {
		Session session = retrieveSession();
		return session.get(Item.class, id);
	}
	public void update(Item item) {
		 Session session = retrieveSession();
		 Transaction tran = session.beginTransaction();
		 Item temp=read(item.getId());
		 temp.setName(item.getName());
		 temp.setCategory(item.getCategory());
		 temp.setPrice(item.getPrice());
		 if(item.getPicture()!=null)
			 temp.setPicture(item.getPicture());
		 session.update(temp);
		 tran.commit();
		 session.close();
	}
	public void delete(Integer id) {
		Session session = retrieveSession();
		Transaction tran = session.beginTransaction();
		Item i = read(id);
		session.delete(i);
		tran.commit();
		session.close();
	}
	
}
