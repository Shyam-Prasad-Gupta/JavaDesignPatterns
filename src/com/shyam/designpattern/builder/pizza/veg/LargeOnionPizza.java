package com.shyam.designpattern.builder.pizza.veg;

public class LargeOnionPizza extends VegPizza{

	@Override
	public String name() {
		return "Onion Pizza";
	}

	@Override
	public String size() {
		return "Large Pizza";
	}

	@Override
	public float price() {
		return 190.0f;
	}	
}
