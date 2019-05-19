

package com.xworkz.food.app;

public class database {

	private String name;
	
	public database() {
		System.out.println("created database\t"+ this.getClass().getSimpleName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
