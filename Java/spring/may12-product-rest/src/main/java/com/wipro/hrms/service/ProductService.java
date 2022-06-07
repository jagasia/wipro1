package com.wipro.hrms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.hrms.entity.Product;
import com.wipro.hrms.repository.ProductRepository;

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
		Product p=null;
		if(x.isPresent())
		{
			p=x.get();
		}
		return p;
	}
	public Product update(Product product) {
		Optional<Product> x = pr.findById(product.getId());
		Product p=null;
		if(x.isPresent())
		{
			p=product;
			pr.save(product);
		}
		return p;
	}
	public Product delete(Integer id) {
		Optional<Product> x = pr.findById(id);
		Product p=null;
		if(x.isPresent())
		{
			p=x.get();
			pr.delete(p);
		}
		return p;
	}
	
}