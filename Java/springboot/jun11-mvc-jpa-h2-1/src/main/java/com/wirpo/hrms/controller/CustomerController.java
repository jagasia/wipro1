package com.wirpo.hrms.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wirpo.hrms.entity.Customer;
import com.wirpo.hrms.exception.CustomerNotFoundException;
import com.wirpo.hrms.exceptions.CustomerAlreadyExist;
import com.wirpo.hrms.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService cs;
	
	@GetMapping
	public String home(ModelMap model)
	{
		model.addAttribute("message","Welcome to our home page");		
		return "index";
	}
	
	@GetMapping("/signup")
	public String showSignupPage(ModelMap model)
	{
		model.addAttribute("customer", new Customer());
		return "signup";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@PostMapping("/validateLogin")
	public String validateLogin(@RequestParam("id")String id, @RequestParam("password")String password, ModelMap model, HttpSession session)
	{
//		System.out.println("You have entered "+id+" and "+password);
		//find customer object by id

		boolean isValid=false;
		
		Customer customer = null;
		try {
			customer=cs.read(id);
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			isValid=false;
		}
		if(customer!=null)
		{
			if(customer.getPassword().equals(password))
			{
				//login is successful
				isValid=true;
			}else
			{
				//pwd is wrong
				isValid=false;
			}
		}
		if(isValid)
		{
//			model.addAttribute("firstName", customer.getFirstName());
//			session.setAttribute("firstName", customer.getFirstName());
			session.setAttribute("user", customer);
			model.addAttribute("message", "Login is successful");
		}
		else
		{
			model.addAttribute("message", "Login failed");
		}
		
		return "index";
	}
	
	@PostMapping("/addCustomer")
//	@ResponseBody
	public String addCustomer(@ModelAttribute("customer") @Valid Customer customer, BindingResult br, ModelMap model) throws CustomerAlreadyExist, CustomerNotFoundException
	{
		if(br.hasErrors())
		{
			return "signup";
		}
		cs.create(customer);
		model.addAttribute("message","You have signed up successfully. Now you can login.!");
		return "index";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap model)
	{
		model.addAttribute("message", "You are logged out successfully.");
		session.invalidate(); 		//to logout. this will remove all the session attributes
		return "index";
	}
}
