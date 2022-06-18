package com.wipro.hrms;

import org.springframework.stereotype.Component;

@Component("bose")
public class Bose implements Audio {

	@Override
	public void play() {
		System.out.println("Wow!, the sound that Bose produces is very Good!");
		
	}

}
