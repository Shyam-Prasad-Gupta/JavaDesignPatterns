package com.shyam.designpattern.builder.pizza.veg;

public class ExtraLargeCheezePizza extends VegPizza {

	@Override
	public String name() {
		return "Cheeze Pizza";
	}

	@Override
	public String size() {
		return "Extra Large Pizza";
	}

	@Override
	public float price() {
		return 250.0f;
	}
}
