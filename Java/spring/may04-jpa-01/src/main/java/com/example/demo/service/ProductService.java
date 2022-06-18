package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pr;
	
	public Product create(Product product) {
		return pr.save(product);
	}
	public List<Product> read() {
		return pr.findAll();
	}
	public Product read(Integer id) {
		Optional<Product> x = pr.findById(id);
		Product product=null;
		if(x.isPresent())
		{
			product=x.get();
		}
		return product;
	}
	public Product update(Product product) {
		return pr.save(product);
	}
	public Product delete(Integer id) {
		Optional<Product> x = pr.findById(id);
		Product product=null;
		if(x.isPresent())
		{
			product=x.get();
			pr.delete(product);
		}
		return product;
	}
	
}
