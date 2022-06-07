package com.wipro.hrms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wipro.hrms.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	@Query("select e from Employee e where e.lastName=:lastName")
	public List<Employee> findEmployeesByLastName(@Param("lastName") String lastName);
}
