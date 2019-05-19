package com.xworkz.food.app;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	private List<String> foodItems = new ArrayList<>();
	private int price = 30;

	public Hotel() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
		foodItems.add("Chicken");
		foodItems.add("Sandwich");
		foodItems.add("Chitranna");
		foodItems.add("MasalaDosa");
		foodItems.add("Maggie");
		foodItems.add("Idli vada");

	}

	public int order(String item, int qty) {
		System.out.println("invoked order with item \t" + item + "\t qty" + qty);
		if (foodItems.contains(item)) {
			System.out.println("item found ");
			int total = qty * price;
			System.out.println("total price \t" + total);
			return total;
		}
		return 0;

	}

}
