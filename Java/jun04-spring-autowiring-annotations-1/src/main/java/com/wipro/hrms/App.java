package com.wipro.hrms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.hrms.config.MyConfiguration;
import com.wipro.hrms.model.Car;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
		//specify the base package and refresh
//		ctx.scan("com");
//		ctx.refresh();
		Car car=ctx.getBean(Car.class);
		car.getPlayer().play();
			System.out.println("Hi");
	}
}
