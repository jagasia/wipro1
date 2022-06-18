package com.wipro.hrms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private Double price;
	private String category;
	private byte[] picture;
	
	public Item() {}

	

	public Item(Integer id, String name, Double price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	

	public Item(Integer id, String name, Double price, String category, byte[] picture) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.picture = picture;
	}


	public Item(String name, Double price, String category, byte[] picture) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public byte[] getPicture() {
		return picture;
	}



	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	
	
}
