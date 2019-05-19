package com.xworkz.food.app;

public class Cricket {

	
	private int noofplayers;
	private String teamname;
	public Cricket( String teamname) {
		
		this.teamname = teamname;
		System.out.println("invoked param const with string");
	}
	public void setnoofplayers(int noofplayers) {
		System.out.println("invoked noofplayers in a team");
		System.out.println("invoked team");
		
		this.noofplayers=noofplayers;
	}
	public void setteamname(String teamname) {
		this.teamname = teamname;
	}
	public String getTeamname() {
		return teamname;
	}
	public int getNoofplayers() {
		return noofplayers;
	}
}

