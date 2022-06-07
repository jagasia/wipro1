package com.wipro.hrms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.hrms.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>
{
	@Query("select distinct i.category from Item i order by category")
	public List<String> retrieveCategories();
}
