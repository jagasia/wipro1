package com.wipro.hrms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.hrms.entity.Car;
import com.wipro.hrms.entity.Employee;
import com.wipro.hrms.entity.Sony;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //to get bean from context, first we need to declare the context
        //what is a context? Context is the object representation of xml configuration file
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
//        Employee e = ctx.getBean(Employee.class);
//        
//        System.out.println(e);
        
        Car car=(Car) ctx.getBean("car");
        car.getPioneer().play();
    }
}
