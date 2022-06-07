package com.wipro.hrms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.hrms.model.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
    	Car car=(Car) ctx.getBean("car");
    	car.getPlayer().play();
    	System.out.println("Hi");
    }
}
