package com.wipro.hrms.model;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SessionFactory {
	public static Session retrieveSession()
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		return cfg.buildSessionFactory().openSession();
	}
}
