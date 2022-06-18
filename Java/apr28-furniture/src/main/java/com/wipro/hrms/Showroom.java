package com.wipro.hrms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Showroom {
	@Autowired
	@Qualifier("chair")
	private Furniture furniture;

	public Showroom() {

	}

	public Showroom(Furniture furniture) {
		super();
		this.furniture = furniture;
	}

	public Furniture getFurniture() {
		return furniture;
	}

	public void setFurniture(Furniture furniture) {
		this.furniture = furniture;
	}

}
