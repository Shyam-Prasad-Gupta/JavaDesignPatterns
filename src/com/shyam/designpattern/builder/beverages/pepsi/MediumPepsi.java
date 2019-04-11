package com.shyam.designpattern.builder.beverages.pepsi;

public class MediumPepsi extends Pepsi {

	@Override
	public String name() {
		return "750ml Pepsi";
	}

	@Override
	public String size() {
		return "Small Pepsi";
	}

	@Override
	public float price() {
		return 40.0f;
	}
}
