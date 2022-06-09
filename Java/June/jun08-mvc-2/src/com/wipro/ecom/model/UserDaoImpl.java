package com.wipro.ecom.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl {
	@Autowired
	private JdbcTemplate jt;
	

	public int create(User user) {
		return jt.update("INSERT INTO user_master VALUES(?,?,?,?,?",user.getUsername(), user.getPassword(), user.getEmail(), user.getFirstName(), user.getLastName());
	}
	public List<User> read() {
		return jt.query("SELECT * FROM user_master", new UserRowMapper());
	}
	public User read(String username) {
		return jt.queryForObject("SELECT * FROM user_master WHERE username=?", new UserRowMapper(),username);
	}
	public int update(User user) {
		return jt.update("UPDATE user_master SET password=?, email=?, first_name=?, last_name=? WHERE username=?", user.getPassword(), user.getEmail(), user.getFirstName(), user.getLastName(), user.getUsername());
	}
	public int delete(String username) {
		return jt.update("DELETE FROM user_master WHERE username=?",username);
	}
	
	
}
