package com.wirpo.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wirpo.hrms.entity.Food;
import com.wirpo.hrms.service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {
	@Autowired
	private FoodService fs;
	
	@GetMapping
	public List<Food> retrieveAllFoods()
	{
		return fs.read();
	}
	
	@GetMapping("/{id}")
	public Food findFoodById(@PathVariable("id") Integer id)
	{
		return fs.read(id);
	}
	
	@PostMapping
	public Food addFood(@RequestBody Food food)
	{
		return fs.create(food);
	}
	
	@PutMapping
	public Food modifyFood(@RequestBody Food food)
	{
		return fs.update(food);
	}
	
	@DeleteMapping("/{id}")
	public Food deleteFood(@PathVariable("id") Integer id)
	{
		return fs.delete(id);
	}
	
	@GetMapping("/name/{name}")
	public List<Food> findFoodByName(@PathVariable("name") String name)
	{
		return fs.findLikeName(name);
	}
}
