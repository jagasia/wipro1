package com.wipro.abcd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.tomcat.util.codec.binary.Base64;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String category;
	private String name;
	private Double price;
	private byte[] picture;
	
	public Item() {}

	public Item(Integer id, String category, String name, Double price, byte[] picture) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.price = price;
		this.picture = picture;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public byte[] getPicture() {
		return picture;
	}
	
	public String getPicture1()
	{
		return Base64.encodeBase64String(this.picture);
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	
}
