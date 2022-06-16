package com.wirpo.hrms;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wirpo.hrms.entity.Customer;
import com.wirpo.hrms.repository.CustomerRepository;

@SpringBootTest
class Jun13JpaFinder1ApplicationTests {
	@Autowired
	private CustomerRepository cr;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void testCreateCustomer()
//	{
//		Customer customer=new Customer("dinesh", "dinesh@123", "Dinesh", "srinivasan", new Date(), "dinesh@india.com", "3849389393");
//		Customer result = cr.save(customer);
//		assertEquals(customer, result);
//		//earler, assertEquals was comparing the objects references. Now it is comparing the objects ids
//		//Why? assertEquals is using equals() method. Since we did not override equals, they compared the references of ref types. since Customer class has equals() method,
//		//their values are compared
//	}
	
//	@Test
//	public void testFindById()
//	{
//		String id="jag";
//		Optional<Customer> c = cr.findById(id);
//		Customer customer=c.get();
//		System.out.println(customer);
//		assertEquals(customer.getId(), id);
//	}
	
//	@Test
//	public void testFindByFirstName()
//	{
//		List<Customer> c = cr.findByFirstName("dinesh");
//		System.out.println("********************************************************");
//		for(Customer customer:c)
//		{
//			System.out.println(customer);
//		}
//		assertNotEquals(c.size(), 0);
//	}
	
//	@Test
//	public void testFindByFirstNameAndLastName()
//	{
//		List<Customer> customers = cr.findByFirstNameAndLastName("Dinesh", "Srinivasan");
//		for(Customer customer:customers)
//		{
//			System.out.println(customer);
//		}
//		assertNotEquals(customers.size(), 0);
//	}
	
	@Test
	public void testFindByFirstOrAndLastName()
	{
		List<Customer> customers = cr.findByFirstNameOrLastName("Dinesh", "Srinivasan");
		for(Customer customer:customers)
		{
			System.out.println(customer);
		}
		assertNotEquals(customers.size(), 0);
	}
}
