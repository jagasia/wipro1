package com.wipro.ecom;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.ecom.config.MyConfiguration;
import com.wipro.ecom.model.UserDaoImpl;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
		UserDaoImpl udao = ctx.getBean(UserDaoImpl.class);
		
	}

}
