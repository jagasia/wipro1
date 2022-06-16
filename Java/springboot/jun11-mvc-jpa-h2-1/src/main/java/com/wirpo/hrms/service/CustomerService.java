package com.wirpo.hrms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wirpo.hrms.entity.Customer;
import com.wirpo.hrms.exception.CustomerNotFoundException;
import com.wirpo.hrms.exceptions.CustomerAlreadyExist;
import com.wirpo.hrms.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository cr;
	
	public Customer create(Customer customer) throws CustomerAlreadyExist, CustomerNotFoundException {
		Customer temp = null;
		try {
		temp=read(customer.getId());
		}catch(CustomerNotFoundException nfe)
		{
			cr.save(customer);
				
		}
		if(temp!=null)
		{
			throw new CustomerAlreadyExist("Customer with id:"+customer.getId()+" already exist. Cannot create.");
		}
		
		return customer;
	}
	public List<Customer> read() {
		return cr.findAll();
	}
	public Customer read(String id) throws CustomerNotFoundException {
		Optional<Customer> temp = cr.findById(id);
		Customer c=null;
		if(temp.isPresent())
		{
			c=temp.get();
		}else
		{
			throw new CustomerNotFoundException("No customer is found with id:"+id);
		}
		return c;
	}
	public void update(Customer customer) throws CustomerNotFoundException{
		Customer temp=read(customer.getId());
		cr.save(customer);
	}
	public void delete(String id) throws CustomerNotFoundException {
		Customer temp=read(id);
		cr.delete(temp);
	}
	
}
