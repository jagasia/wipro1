package com.wipro.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.hrms.enity.MyUser;

@Repository
public interface UserRepository extends JpaRepository<MyUser, String>
{

}
