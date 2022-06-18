package com.wipro.bank.entity;

import org.springframework.stereotype.Component;

@Component
public class Mathematics {
	public void sum(int x, int y)
	{
		System.out.printf("The sum of %d and %d is %d\n",x,y,(x+y));
	}
	
	public void product(int x, int y)
	{
		System.out.printf("The product of %d and %d is %d\n",x,y,(x*y));
	}
}
