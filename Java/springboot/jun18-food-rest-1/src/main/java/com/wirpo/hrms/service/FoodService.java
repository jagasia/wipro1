package com.wirpo.hrms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wirpo.hrms.entity.Food;
import com.wirpo.hrms.repository.FoodRepository;

@Service
public class FoodService {
	@Autowired
	private FoodRepository fr;
	
	public Food create(Food food) {
		return fr.save(food);
	}
	public List<Food> read() {
		return fr.findAll();
	}
	public Food read(Integer id) {
		Optional<Food> temp = fr.findById(id);
		Food f=null;
		if(temp.isPresent())
		{
			f=temp.get();
		}
		return f;
	}
	public Food update(Food food) {
		return fr.save(food);
	}
	public Food delete(Integer id) {
		Food f = null;
		f=read(id);
		if(f!=null)
		{
			fr.delete(f);
		}
		return f;
	}
	
	public List<Food> findByFoodName(String name)
	{
		//how to find all the food items by their name?
		return fr.findByName(name);
	}
	
	public List<Food> findLikeName(String name)
	{
		return fr.findFoodLikeName(name);
	}
}