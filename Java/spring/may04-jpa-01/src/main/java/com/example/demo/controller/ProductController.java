package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService ps;

	
	@ModelAttribute("products")
	public List<Product> getAllProducts()
	{
		return ps.read();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/showProduct")
	public String showProductPage(@ModelAttribute("product") Product product)
	{
		getAllProducts();
		return "product";
	}
	
//	@RequestMapping(method = RequestMethod.POST, value = "/product")
//	@ResponseBody			//this method does not return view. But it returns content that is displayed in the browser
//	public Product productDml(@ModelAttribute("product") Product product)
//	{
//		return product;
//	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/product", params = "add")
	public String addProduct(@ModelAttribute("product") Product product)
	{
		//to store a row in PRODUCT table, use product object to send to create method of ProductService
		ps.create(product);
		return showProductPage(product);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/product", params = "update")
	public String updateProduct(@ModelAttribute("product") Product product)
	{
		ps.update(product);
		return showProductPage(product);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/product", params = "delete")
	public String deleteProduct(@ModelAttribute("product") Product product)
	{
		ps.delete(product.getId());
		return showProductPage(new Product());
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/select/{id}")
	public String selectProduct(@PathVariable("id") Integer id, ModelMap model)
	{
		Product p = ps.read(id);
		model.addAttribute("product",p);
		return "product";
	}
}
