package com.wipro.hrms.config;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.wipro.hrms.entity.MyUser;
import com.wipro.hrms.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService
{
	@Autowired
	private UserRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		return new User("binny", "binny", new ArrayList<>());
		 return read(username);
	}

	public MyUser create(MyUser user)
	{
		return ur.save(user);
	}
	public List<MyUser> read()
	{
		return ur.findAll();
	}
	public MyUser read(String username)
	{
		Optional<MyUser> x = ur.findById(username);
		 MyUser user=null;
		 if(x.isPresent())
		 {
			 user=x.get();
		 }
		 return user;
		
	}
	public MyUser update(MyUser user)
	{
		Optional<MyUser> x = ur.findById(user.getUsername());
		 MyUser u=null;
		 if(x.isPresent())
		 {
			 u=user;
			 ur.save(user);
		 }
		 return u;
	}
	public MyUser delete(String username)
	{
		Optional<MyUser> x = ur.findById(username);
		 MyUser user=null;
		 if(x.isPresent())
		 {
			 user=x.get();
			 ur.delete(user);
		 }
		 return user;
	}
	
}
