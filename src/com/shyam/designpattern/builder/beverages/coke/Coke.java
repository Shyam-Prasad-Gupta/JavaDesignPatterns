package com.shyam.designpattern.builder.beverages.coke;

import com.shyam.designpattern.builder.beverages.ColdDrink;

public abstract class Coke extends ColdDrink {

	@Override
	public abstract String name();

	@Override
	public abstract String size();

	@Override
	public abstract float price();
}
