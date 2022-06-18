package com.wirpo.hrms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wirpo.hrms.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{
	List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
	
	List<Customer> findByFirstNameOrLastName(String firstName,String LastName);
	
	List<Customer> findByFirstName(String firstName);
	List<Customer> findByLastName(String lastName);
	List<Customer> findByEmail(String email);
	
	
}
