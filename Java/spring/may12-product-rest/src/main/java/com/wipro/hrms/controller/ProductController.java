package com.wipro.hrms.controller;

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

import com.wipro.hrms.entity.Product;
import com.wipro.hrms.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@PostMapping
	public Product addProduct(@RequestBody Product product)
	{
		return ps.create(product);
	}
	
	@GetMapping
	public List<Product> retrieveAllProducts()
	{
		return ps.read();
	}
	
	@GetMapping("/{id}")
	public Product findProductById(@PathVariable("id") Integer id)
	{
		return ps.read(id);
	}
	
	@PutMapping
	public Product updateProduct(@RequestBody Product product)
	{
		return ps.update(product);
	}
	
	@DeleteMapping("/{id}")
	public Product deleteProduct(@PathVariable("id") Integer id)
	{
		return ps.delete(id);
	}
}