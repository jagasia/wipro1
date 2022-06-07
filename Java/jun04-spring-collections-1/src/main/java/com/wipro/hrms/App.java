package com.wipro.hrms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.hrms.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
        Student student=(Student) ctx.getBean("student");
        System.out.println(student);
    }
}
