package com.shyam.designpattern.builder.pizza.veg;

public class SmallOnionPizza extends VegPizza {

	@Override
	public String name() {
		return "Onion Pizza";
	}

	@Override
	public String size() {
		return "Small Pizza";
	}

	@Override
	public float price() {
		return 150.0f;
	}
}
