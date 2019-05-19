package com.xworkz.food.app;

// Java Bean 
public class Xworkz {

	private int noOfTrainers;

	public Xworkz(int noOfTrainers) {
		System.out.println("Created \t" + this.getClass().getCanonicalName());
		this.noOfTrainers = noOfTrainers;
	}
	
	public int getNoOfTrainers() {
		return noOfTrainers;
	}
}
