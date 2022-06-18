package com.wirpo.hrms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.wirpo.hrms.service.CustomerService;

@Configuration
public class MyConfiguration extends WebSecurityConfigurerAdapter
{
	@Autowired
	private CustomerService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}
	
	@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.authorizeRequests().antMatchers("/login","/showSignup").permitAll()
//		.anyRequest().authenticated();
//	}

	 @Override 
	   protected void configure(HttpSecurity http) throws Exception { 
	      http 
	      .csrf().disable()
	      .authorizeRequests().antMatchers("/showSignup")
	      .permitAll() .anyRequest().authenticated() 
	      .and() 
	      .formLogin() .loginPage("/showLogin")
	      .permitAll() 
	      .and() 
	      .logout() .invalidateHttpSession(true) 
	      .clearAuthentication(true) .permitAll(); 
	   }


	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}
}
