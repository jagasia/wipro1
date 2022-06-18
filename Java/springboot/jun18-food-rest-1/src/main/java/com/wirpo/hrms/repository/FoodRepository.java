package com.wirpo.hrms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wirpo.hrms.entity.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer>
{
	List<Food> findByName(String name);
	
	@Query("select f from Food f where f.name like %:name%")
	List<Food> findFoodLikeName(@Param("name") String name);
	
}
