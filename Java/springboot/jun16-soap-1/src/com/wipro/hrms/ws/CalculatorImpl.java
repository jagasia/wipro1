package com.wipro.hrms.ws;

public class CalculatorImpl implements Calculator {
	@Override
	public int sum(int i, int j)
	{
		return i+j;
	}
	
	@Override
	public int difference(int i, int j)
	{
		return i-j;
	}
	
	@Override
	public int product(int i, int j)
	{
		return i*j;
	}
}
