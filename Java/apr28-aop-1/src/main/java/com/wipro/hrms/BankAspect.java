package com.wipro.hrms;

public class BankAspect {
	public void beforeAdvice()
	{
		System.out.println("Before advice");
	}
	
	public void beforeAdvice2()
	{
		System.out.println("This is ebfore advice 2");
	}
	
	public void afterAdvice()
	{
		System.out.println("After advice");
	}
	
	public void afterAdvice2()
	{
		System.out.println("This is After advice2");
	}
}
