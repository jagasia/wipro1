package com.wipro.hrms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
    	Showroom sr = ctx.getBean(Showroom.class);
    	sr.getFurniture().display();
        System.out.println( "Hello World!" );
    }
}
