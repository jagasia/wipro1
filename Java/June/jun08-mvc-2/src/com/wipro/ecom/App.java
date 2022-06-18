package com.wipro.ecom;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.ecom.model.User;
import com.wipro.ecom.model.UserDaoImpl;

public class App {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
		UserDaoImpl udao = ctx.getBean(UserDaoImpl.class);
		List<User> users = udao.read();
		for(User u:users)
			System.out.println(u);
	}

}
