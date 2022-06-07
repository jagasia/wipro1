package com.wipro.hrms;

import org.springframework.stereotype.Component;

@Component("jbl")
public class Jbl implements Audio
{

	@Override
	public void play() {
		System.out.println("Jbl audio makes very good sound!");
	}

}
