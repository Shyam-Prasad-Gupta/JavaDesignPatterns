package com.shyam.designpattern.builder.pizza.veg;

public class MediumCheezePizza extends VegPizza {

	@Override
	public String name() {
		return "Cheeze Pizza";
	}

	@Override
	public String size() {
		return "Medium Pizza";
	}

	@Override
	public float price() {
		return 200.0f;
	}
}
