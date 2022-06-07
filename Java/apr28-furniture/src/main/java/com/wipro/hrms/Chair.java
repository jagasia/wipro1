package com.wipro.hrms;

import org.springframework.stereotype.Component;

@Component("chair")
public class Chair implements Furniture
{
	public void display()
	{
		System.out.println("Chair is comfortable to sit");
	}
}
