package com.wipro.hrms.enity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

@Entity
@Table(name = "USER_MASTER")
public class MyUser extends User
{
	@Id
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	
	public MyUser() {
		super("jag", "jag", new ArrayList<>());
	}

	public MyUser(String username, String password, Collection<? extends GrantedAuthority> authorities,
			String username2, String password2, String firstName, String lastName, String email) {
		super(username, password, authorities);
		username = username2;
		password = password2;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MyUser [username=" + username + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + "]";
	}
	
}
