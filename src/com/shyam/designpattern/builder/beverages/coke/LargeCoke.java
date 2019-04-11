package com.shyam.designpattern.builder.beverages.coke;

public class LargeCoke extends Coke {

	@Override
	public String name() {
		return "1.5L Coke";
	}

	@Override
	public String size() {
		return "Large Coke";
	}

	@Override
	public float price() {
		return 60.0f;
	}
}
