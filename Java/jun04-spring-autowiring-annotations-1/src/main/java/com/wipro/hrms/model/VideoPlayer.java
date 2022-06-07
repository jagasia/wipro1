package com.wipro.hrms.model;

//@Component("video")
public class VideoPlayer implements Player
{

	@Override
	public void play() {
		System.out.println("Video player plays movies also with sound");
	}

}
