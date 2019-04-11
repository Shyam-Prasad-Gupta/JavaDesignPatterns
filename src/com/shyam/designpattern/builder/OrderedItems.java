package com.shyam.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class OrderedItems {

	public List<Item> itemList = new ArrayList<>();

	public void addItem(Item item) {
		itemList.add(item);
	}

	public float getCost() {
		float cost = 0.0f;

		for (Item item : itemList) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems() {
		for (Item item : itemList) {
			System.out.println("Item is: " + item.name());
			System.out.println("Size is: " + item.size());
			System.out.println("Price is: " + item.price());
		}
	}
}