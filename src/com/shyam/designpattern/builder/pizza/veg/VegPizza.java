package com.shyam.designpattern.builder.pizza.veg;

import com.shyam.designpattern.builder.pizza.Pizza;

public abstract class VegPizza extends Pizza {

	@Override
	public abstract String name();

	@Override
	public abstract String size();

	@Override
	public abstract float price();
}
