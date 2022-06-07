package com.wipro.swiggy.model;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class FoodDaoImpl {
	private HibernateTemplate ht;
	public FoodDaoImpl() {
		
	}
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Transactional
	public void create(Food food)
	{
		ht.save(food);
	}
	
	public List<Food> read() {
		return ht.loadAll(Food.class);
	}
	public Food read(Integer id) {
		return ht.get(Food.class, id);
	}
	
	@Transactional
	public void update(Food food) {
		Food temp = read(food.getId());
		if(temp!=null)
		{
			temp.setName(food.getName());
			temp.setCategory(food.getCategory());
			temp.setPrice(food.getPrice());
			ht.update(temp);
		}
	}
	@Transactional
	public void delete(Integer id) {
		Food temp = read(id);
		if(temp!=null)
		{
			ht.delete(temp);
		}
	}
	
}
