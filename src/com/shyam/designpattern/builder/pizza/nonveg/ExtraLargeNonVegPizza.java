package com.shyam.designpattern.builder.pizza.nonveg;

import com.shyam.designpattern.builder.pizza.veg.NonVegPizza;

public class ExtraLargeNonVegPizza extends NonVegPizza {

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
		return 260.0f;
	}
}