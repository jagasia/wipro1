package com.wipro.bank;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.bank.entity.AbcBank;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
        AbcBank abc= (AbcBank) ctx.getBean("abc");
        abc.deposit();
        abc.withdrawal();
    }
}
