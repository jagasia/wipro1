package com.wirpo.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wirpo.hrms.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>
{

}
