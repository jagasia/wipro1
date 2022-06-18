package com.wirpo.hrms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.wirpo.hrms.repository.CustomerRepository;
import com.wirpo.hrms.service.CustomerService;

@Component public class AuthProvider implements AuthenticationProvider { 
	   @Autowired private CustomerService userDetailsService; 
	   @Autowired private PasswordEncoder passwordEncoder; 
//	   @Autowired private AttemptsRepository attemptsRepository; 
	   @Autowired private CustomerRepository userRepository;
	   
	   
	   
	   @Override
	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		// TODO Auto-generated method stub
		   
		userDetailsService.loadUserByUsername(authentication.getName());
		return authentication;		
	}



	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return true;
	}
}