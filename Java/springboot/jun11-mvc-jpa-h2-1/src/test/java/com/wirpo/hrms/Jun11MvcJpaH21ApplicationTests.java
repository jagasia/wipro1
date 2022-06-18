package com.wirpo.hrms;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wirpo.hrms.entity.Customer;
import com.wirpo.hrms.exception.CustomerNotFoundException;
import com.wirpo.hrms.service.CustomerService;

@SpringBootTest
class Jun11MvcJpaH21ApplicationTests {
	@Autowired
	private CustomerService cs;
	
	@Test
	void contextLoads() {
		System.out.println(cs);
		assertNotEquals(cs, null);
	}

	@Test
	public void testFindById() throws CustomerNotFoundException
	{
		Customer result = cs.read("jag");
		assertNotNull(result);
	}
}
