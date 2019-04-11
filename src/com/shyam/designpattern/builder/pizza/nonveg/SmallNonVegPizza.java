package com.shyam.designpattern.builder.pizza.nonveg;

public class SmallNonVegPizza extends NonVegPizza{

	@Override
	public String name() {
		return "Non Veg Pizza";
	}

	@Override
	public String size() {
		return "Small Pizza";
	}

	@Override
	public float price() {
		return 185.0f;
	}
}
