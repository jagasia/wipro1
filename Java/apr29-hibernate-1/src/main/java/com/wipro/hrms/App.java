package com.wipro.hrms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
        System.out.println( "Hello World!" );
    }
}
