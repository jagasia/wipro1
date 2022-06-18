package com.wipro.hrms.model;

import org.springframework.stereotype.Component;

@Component("audio")
public class AudioPlayer implements Player
{

	@Override
	public void play() {
		System.out.println("Audio player makes good sound!");
	}

}
