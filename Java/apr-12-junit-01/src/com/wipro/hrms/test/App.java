package com.wipro.hrms.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class App {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MathsTest.class);
		System.out.println("There are "+result.getFailureCount()+" failures in this code");
		for(Failure f:result.getFailures())
		{
			System.out.println(f.getTestHeader()+":"+f.getMessage());
		}

	}

}
