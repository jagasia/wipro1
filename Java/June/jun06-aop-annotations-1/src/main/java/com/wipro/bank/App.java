package com.wipro.bank;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.bank.config.MyConfiguration;
import com.wipro.bank.entity.Mathematics;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
//        ctx.scan("com");
//        ctx.refresh();
        
        Mathematics m = ctx.getBean(Mathematics.class);
        
        m.sum(2, 3);
        m.product(2, 3);
    }
}
