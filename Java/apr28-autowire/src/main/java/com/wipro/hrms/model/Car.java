package com.wipro.hrms.model;


public class Car {
	
	private Audio audio;			//interface.			Loosely coupled		
	
	public Car() {}

	public Car(Audio audio) {
		super();
		this.audio = audio;
	}

	public Audio getAudio() {
		return audio;
	}

	public void setAudio(Audio audio) {
		this.audio = audio;
	}
	
}
