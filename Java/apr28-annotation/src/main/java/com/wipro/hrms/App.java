package com.wipro.hrms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        ClassPathXmlApplicationContext
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.scan("com");
        ctx.refresh();
        Car car=ctx.getBean(Car.class);
        car.getAudio().play();
    }
}
