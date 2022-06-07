package com.wipro.hrms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.hrms.model.Employee;

public class App {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
//		Employee employee = ctx.getBean(Employee.class);
		Employee e1=(Employee) ctx.getBean("emp");
		Employee e2=(Employee) ctx.getBean("emp2");
		
		System.out.println(e1);
		System.out.println(e2);
	}

}
