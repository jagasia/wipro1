package com.wipro.hrms;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		JdbcTemplate jt = new JdbcTemplate();
//		DriverManagerDataSource dmds = new DriverManagerDataSource();
//		dmds.setDriverClassName("com.mysql.jdbc.Driver");
//		dmds.setUrl("jdbc:mysql://localhost:3306/bank");
//		dmds.setUsername("root");
//		dmds.setPassword("");
//		
//		jt.setDataSource(dmds);
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		BranchDao bdao= (BranchDao) ctx.getBean("bdao");

//		List<Branch> branches = bdao.read();
//		for(Branch b:branches)
//			System.out.println(b);
//	
		System.out.println(bdao.read("B00114"));
		
		System.out.println("Hello World!");
	}
}
