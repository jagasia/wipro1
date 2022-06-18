package com.wipro.bank.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component("aspect")
public class MyAspect {

	@Pointcut("execution(* com.wipro.bank.entity.*.*(..))")
	public void all()
	{
		
	}
	
	@Before("all()")
	public void beforeAdvice()
	{
		System.out.println("This is before advice");
	}
	
	@After("all()")
	public void afterAdvice()
	{
		System.out.println("After advice is working now");
	}
	
//	@Around("all()")
//	public void aroundAdvice()
//	{
//		System.out.println("Something is going around now");
//	}
}
