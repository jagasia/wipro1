package com.wipro.ecom.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.wipro"})
public class MyConfiguration {
	
	@Bean
	public DriverManagerDataSource dmds()
	{
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setUrl("jdbc:mysql://localhost:3306/wipro3");
		dmds.setDriverClassName("com.mysql.jdbc.Driver");
		dmds.setUsername("root");
		dmds.setPassword("");
		return dmds;
	}
	
	@Bean
	public JdbcTemplate jt(DataSource dmds)
	{
		JdbcTemplate jt=new JdbcTemplate(dmds);
		return jt;
	}
	
	@Bean
	public InternalResourceViewResolver abcd()
	{
		InternalResourceViewResolver irvr=new InternalResourceViewResolver();
		irvr.setPrefix("/WEB-INF/jsp/");
		irvr.setSuffix(".jsp");
		return irvr;
	}
}
