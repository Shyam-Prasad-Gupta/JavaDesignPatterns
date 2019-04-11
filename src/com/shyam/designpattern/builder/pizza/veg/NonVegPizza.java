package com.shyam.designpattern.builder.pizza.veg;

public abstract class NonVegPizza extends Pizza {

	@Override
	public abstract String name();

	@Override
	public abstract String size();

	@Override
	public abstract float price();
}
