package com.wipro.hrms.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.wipro"})
public class MyConfiguration {

	@Bean
	public DriverManagerDataSource dataSource()
	{
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setUrl("jdbc:mysql://localhost:3306/wipro3");
		dmds.setDriverClassName("com.mysql.jdbc.Driver");
		dmds.setUsername("root");
		dmds.setPassword("");
		return dmds;
	}
	@Bean
	public JdbcTemplate jt(DataSource dataSource)
	{
		return new JdbcTemplate(dataSource);
	}
}
