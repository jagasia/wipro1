package com.wirpo.hrms.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.wirpo.hrms.entity.Customer;
import com.wirpo.hrms.repository.CustomerRepository;

@Service
public class CustomerService implements UserDetailsService
{
	@Autowired
	private CustomerRepository cr;

	@Override
	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
//		return new User("jag", "jag@123", new ArrayList<>());
		Optional<Customer> temp = cr.findById(id);
		Customer customer=null;
		if(temp.isPresent())
		{
			customer=temp.get();
		}
		return customer;
	}

}
