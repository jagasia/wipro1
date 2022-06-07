package com.wipro.hrms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.hrms.enity.AuthRequest;
import com.wipro.hrms.enity.MyUser;
import com.wipro.hrms.enity.Response;
import com.wipro.hrms.service.UserService;
import com.wipro.hrms.util.JwtUtil;

@RestController
@CrossOrigin({"http://localhost:4200","*"})
public class MyController {
	@Autowired
	private UserService us;
	

    @Autowired
    private JwtUtil jwtUtil;
    
    @Autowired
    private AuthenticationManager authenticationManager;
	
	@PostMapping("/login")
	public Response login(@RequestBody AuthRequest authRequest) throws Exception
	{
		MyUser user=null;
		System.out.println(authRequest.getUsername()+"  :  "+authRequest.getPassword());
//		  try {
//	            authenticationManager.authenticate(
//	                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
//	            );
//	        } catch (Exception ex) {
//	            throw new Exception("inavalid username/password");
//	        }
		user=us.validateLogin(authRequest.getUsername(), authRequest.getPassword());
		Response response=new Response();
		if(user!=null)	
		{
			String token = jwtUtil.generateToken(authRequest.getUsername());
			response.setJwt(token);
		}
		else
		{
			response.setJwt("Login Failed");
		}
		return response;
	}
	
	@PostMapping("/signup")
	public MyUser signup(@RequestBody MyUser user)
	{
		System.out.println("new user create request "+user);
		return us.create(user);
	}
	
	@PutMapping("/update")
	public MyUser updateUser(@RequestBody MyUser user)
	{
		System.out.println("Update request came for "+user);
		return us.update(user);
	}
}