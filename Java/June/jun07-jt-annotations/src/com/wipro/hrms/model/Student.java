package com.wipro.hrms.model;

import java.util.Arrays;
import java.util.Date;

import org.apache.tomcat.util.codec.binary.Base64;

public class Student {
	private Integer id;
	private String name;
	private Date dateOfBirth;
	private byte[] picture;
	
	public Student() {}

	public Student(Integer id, String name, Date dateOfBirth, byte[] picture) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.picture = picture;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	
	public String getPicture1()
	{
		return Base64.encodeBase64String(this.picture);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", picture="
				+ picture.length + "]";
	}
	
}
