package com.shyam.designpattern.builder.pizza.veg;

public class MediumOnionPizza extends VegPizza{

	@Override
	public String name() {
		return "Onion Pizza";
	}

	@Override
	public String size() {
		return "Medium Pizza";
	}

	@Override
	public float price() {
		return 170.0f;
	}	
}
