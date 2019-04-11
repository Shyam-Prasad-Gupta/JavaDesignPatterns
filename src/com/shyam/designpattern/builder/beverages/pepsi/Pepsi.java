package com.shyam.designpattern.builder.beverages.pepsi;

import com.shyam.designpattern.builder.beverages.ColdDrink;

public abstract class Pepsi extends ColdDrink {

	@Override
	public abstract String name();

	@Override
	public abstract String size();

	@Override
	public abstract float price();
}
