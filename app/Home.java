package com.xworkz.food.app;

public class Home {
	// reflection api
	private String name;
	private  int doorNo;

	public Home(String name,int doorNo) {
		System.out.println("Created \t" + this.getClass().getSimpleName());
		this.name = name;
		this.doorNo=doorNo;
	}

	public Home() {
		System.out.println("Created using default \t" + this.getClass().getSimpleName());
	}

}
