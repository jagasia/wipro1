package com.wipro.hrms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.wipro.hrms.enity.MyUser;
import com.wipro.hrms.repository.UserRepository;

@Service
public class UserService implements UserDetailsService
{
	@Autowired
	private UserRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<MyUser> x = ur.findById(username);
		MyUser user=null;
		if(x.isPresent())
		{
			user=x.get();
		}
		return user;
	}

	public MyUser create(MyUser user)
	{
		return ur.save(user);
	}
	
	public MyUser validateLogin(String username, String password)
	{
		Optional<MyUser> x = ur.findById(username);
		MyUser u=null;
		if(x.isPresent())
		{
			MyUser user = x.get();
			if(user.getPassword().equals(password))
			{
				u=user;
			}
		}
		return u;
	}
	public MyUser update(MyUser user)
	{
		Optional<MyUser> x = ur.findById(user.getUsername());
		MyUser u=null;
		if(x.isPresent())
		{
			ur.save(user);
			u=user;
		}
		return u;
	}
	public void delete()
	{
		
	}
	
}