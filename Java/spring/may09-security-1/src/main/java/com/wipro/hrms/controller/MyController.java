package com.wipro.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.hrms.config.MyUserDetailsService;
import com.wipro.hrms.entity.MyUser;

@RestController
public class MyController {
	@Autowired
	private MyUserDetailsService us;


	
	@GetMapping("/contact")
	public String contact()
	{
		return "Contact us";
	}
	
	@PostMapping("/adduser")
	public MyUser addUser(@RequestBody MyUser user)
	{
		return us.create(user);
	}
	
	@GetMapping("/allusers")
	public List<MyUser> retrieveAllUsers()
	{
		return us.read();
	}
	
	@GetMapping("/user/{username}")
	public MyUser findUserByUsername(@PathVariable("username") String username)
	{
		return us.read(username);
	}
	
	@PutMapping("/user")
	public MyUser updateUser(@RequestBody MyUser user)
	{
		return us.update(user);
	}
	
	@DeleteMapping("/user/{username}")
	public MyUser deleteUser(@PathVariable("username") String username)
	{
		return us.delete(username);
	}
}
