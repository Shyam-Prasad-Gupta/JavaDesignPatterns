package com.shyam.designpattern.builder.beverages.coke;

public class MediumCoke extends Coke {

	@Override
	public String name() {
		return "750ml Coke";
	}

	@Override
	public String size() {
		return "Medium Coke";
	}

	@Override
	public float price() {
		return 45.0f;
	}
}
