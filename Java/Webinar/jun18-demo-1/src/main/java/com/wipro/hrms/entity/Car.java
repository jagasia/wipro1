package com.wipro.hrms.entity;

public class Car {
	private Audio pioneer;
	
	public Car() {}

	public Car(Audio pioneer) {
		super();
		this.pioneer= pioneer;
	}

	public Audio getPioneer() {
		return pioneer;
	}

	public void setPioneer(Audio pioneer) {
		this.pioneer = pioneer;
	}
	
	
}
