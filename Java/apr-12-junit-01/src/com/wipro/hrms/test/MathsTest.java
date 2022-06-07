package com.wipro.hrms.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.wipro.hrms.Maths;

public class MathsTest {

	private static Maths maths;
	
	@BeforeClass
	public static void setUpOnce()
	{
		maths=new Maths();
		
	}
	
	@Before
	public void setUp() throws Exception {
		maths.setNo1(2);
		maths.setNo2(3);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testSum() {
//		fail("Not yet implemented");
		assertEquals(5, maths.sum());
	}

	@Test
	public void testDifference() {
		assertEquals(-1, maths.difference());
	}
	
	@Test
	public void testSum2()
	{
		maths.setNo1(20);
		maths.setNo2(30);
		assertEquals(60, maths.sum());
	}

	@Test
	public void testGetMessage1()
	{
		assertEquals("This is the message", maths.getMessage());
	}
}
