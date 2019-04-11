package com.shyam.designpattern.builder.pizza.veg;

public class SmallCheezePizza extends VegPizza {

	@Override
	public String name() {
		return "Cheeze Pizza";
	}

	@Override
	public String size() {
		return "Small Pizza";
	}

	@Override
	public float price() {
		return 170.0f;
	}
}
