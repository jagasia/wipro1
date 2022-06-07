package com.wipro.hrms.model;

public class Car {
	private Player player;		//loosely coupled because, Player is an interface, hence supports anything that implements this interface

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}
	
	
}
