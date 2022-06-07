package com.wipro.hrms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.annotation.MultipartConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.wipro.hrms.entity.Item;
import com.wipro.hrms.service.ItemService;

@RestController
@CrossOrigin({"http://localhost:4200","*"})
@MultipartConfig
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemService is;
	
	
	@GetMapping("/categories")
	public List<String> retrieveCategories()
	{
		return is.retrieveCategories();
	}
	
	@PostMapping
	public Item addItem(@RequestBody Item item)
	{
		return is.create(item);
	}
	
	@PostMapping("/add")
	public Item addItem1(@RequestParam("name")String name,@RequestParam("price") String price,@RequestParam("category") String category, @RequestParam("picture")MultipartFile picture ) throws IOException
	{
		byte[] pic = picture.getBytes();
		Item item=new Item(name, Double.parseDouble(price), category, pic);
		return is.create(item);
	}
	
	@PutMapping("/update")
	public Item updateItem1(@RequestParam("id")Integer id, @RequestParam("name")String name,@RequestParam("price") String price,@RequestParam("category") String category, @RequestParam("picture")MultipartFile picture ) throws IOException
	{
		byte[] pic = picture.getBytes();
		Item item=new Item(id, name, Double.parseDouble(price), category, pic);
		return is.update(item);
	}
	
	@GetMapping
	public List<Item> retrieveItems()
	{
		return is.read();
	}
	
	@GetMapping("/{id}")
	public Item findItemById(@PathVariable("id") Integer id)
	{
		return is.read(id);
	}
	
	@PutMapping
	public Item updateItem(@RequestBody Item item)
	{
		return is.update(item);
	}
	
	@DeleteMapping("/{id}")
	public Item deleteItem(@PathVariable("id") Integer id)
	{
		return is.delete(id);
	}
}
