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
        Product product1=ctx.getBean(Product.class);
        Product product2=ctx.getBean(Product.class);
        product2.setId(200);
        product2.setName("Sharpner");
        product2.setPrice(200.0f);
        
        System.out.println(product1);
        System.out.println(product2);
        System.out.println( "Hello World!" );
    }
}
