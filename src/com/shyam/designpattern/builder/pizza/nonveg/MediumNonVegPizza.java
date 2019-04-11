package com.shyam.designpattern.builder.pizza.nonveg;

public class MediumNonVegPizza extends NonVegPizza {

	@Override
	public String name() {
		return "Non Veg Pizza";
	}

	@Override
	public String size() {
		return "Medium Pizza";
	}

	@Override
	public float price() {
		return 210.0f;
	}
}
