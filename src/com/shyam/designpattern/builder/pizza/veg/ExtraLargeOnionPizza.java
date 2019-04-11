package com.shyam.designpattern.builder.pizza.veg;

public class ExtraLargeOnionPizza extends VegPizza {

	@Override
	public String name() {
		return "Onion Pizza";
	}

	@Override
	public String size() {
		return "Extra Large Pizza";
	}

	@Override
	public float price() {
		return 215.0f;
	}
}