package com.shyam.designpattern.builder.pizza.veg;

public class LargeCheezePizza extends VegPizza {

	@Override
	public String name() {
		return "Cheeze Pizza";
	}

	@Override
	public String size() {
		return "Large Pizza";
	}

	@Override
	public float price() {
		return 225.0f;
	}
}
