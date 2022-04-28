package com.designpatterns.creational.builder.challenge;

import java.util.LinkedList;
import java.util.List;

public class Meal {

	List<Item> items = new LinkedList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public Float getCost() {
		Float cost = 0F;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems() {
		for (Item item : items) {
			System.out.println("Item Name: " + item.name());
			System.out.println("Item Price: " + item.price());
			System.out.println("Item Packed In: " + item.pack().pack());
		}
	}
}
