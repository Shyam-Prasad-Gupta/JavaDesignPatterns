package com.shyam.designpattern.builder.pizza.nonveg;

public class LargeNonVegPizza extends NonVegPizza {

	@Override
	public String name() {
		return "Non Veg Pizza";
	}

	@Override
	public String size() {
		return "Large Pizza";
	}

	@Override
	public float price() {
		return 235.0f;
	}
}
