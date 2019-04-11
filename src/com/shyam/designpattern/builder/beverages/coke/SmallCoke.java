package com.shyam.designpattern.builder.beverages.coke;

public class SmallCoke extends Coke{

	@Override
	public String name() {
		return "300ml Coke";
	}

	@Override
	public String size() {
		return "Small Coke";
	}

	@Override
	public float price() {
		return 25.0f;
	}
}
