package com.wipro.hrms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
//	@Qualifier("bose")
	private Audio bose;			//interface.			Loosely coupled		
	
	public Car() {}

	public Car(Audio audio) {
		super();
		this.bose = audio;
	}

	public Audio getAudio() {
		return bose;
	}

	public void setAudio(Audio audio) {
		this.bose = audio;
	}
	
}
