package com.wipro.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wipro.hrms.api.ProductApi;
import com.wipro.hrms.entity.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductApi api;
	
	@RequestMapping(method = RequestMethod.GET, value = "/show")
	public String showProductPage(@ModelAttribute("product") Product product, ModelMap model)
	{
		System.out.println("Product in showProduct method is "+product);
		//retrieve all products
		
		List<Product> products = api.retrieveAllProducts();
		model.addAttribute("product",product);
		model.addAttribute("products", products);
		return "product";
	}
	
	@GetMapping("/select/{id}")
	public String selectProduct(@ModelAttribute("product") Product product,@PathVariable("id") Integer id, ModelMap model)
	{
		product = api.findProductById(id);
		System.out.println(product);
		return showProductPage(product, model);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "dmlProduct", params = "add")
	public String addProduct(@ModelAttribute("product") Product product, ModelMap model)
	{
		api.addProduct(product);
		return showProductPage(product, model);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "dmlProduct", params = "update")
	public String updateProduct(@ModelAttribute("product") Product product, ModelMap model)
	{
		api.updateProduct(product);
		return showProductPage(product, model);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "dmlProduct", params = "delete")
	public String deleteProduct(@ModelAttribute("product") Product product, ModelMap model)
	{
		api.deleteProduct(product.getId());
		return showProductPage(product, model);
	}
}