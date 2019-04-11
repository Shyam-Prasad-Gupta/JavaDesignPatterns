package com.shyam.designpattern.builder.pizza.nonveg;

import com.shyam.designpattern.builder.pizza.Pizza;

public abstract class NonVegPizza extends Pizza {

	@Override
	public abstract String name();

	@Override
	public abstract String size();

	@Override
	public abstract float price();
}
