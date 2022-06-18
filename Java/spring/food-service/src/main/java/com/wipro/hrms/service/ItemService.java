package com.wipro.hrms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.hrms.entity.Item;
import com.wipro.hrms.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	private ItemRepository ir;
	
	public Item create(Item item) {
		return ir.save(item);
	}
	public List<Item> read() {
		return ir.findAll();
	}
	public Item read(Integer id) {
		Item i=null;
		Optional<Item> x = ir.findById(id);
		if(x.isPresent())
		{
			i=x.get();
		}
		return i;
	}
	public Item update(Item item) {
		Item i=null;
		Optional<Item> x = ir.findById(item.getId());
		if(x.isPresent())
		{			
			i=item;
			ir.save(item);
		}
		return i;
	}
	public Item delete(Integer id) {
		Item item = read(id);
		if(item!=null)
		{
			ir.delete(item);
		}
		return item;
	}
	
	public List<String> retrieveCategories()
	{
		return ir.retrieveCategories();
	}
}
