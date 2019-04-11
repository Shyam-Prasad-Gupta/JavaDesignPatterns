package com.shyam.designpattern.builder.beverages.pepsi;

public class SmallPepsi extends Pepsi{
	
	@Override
	public String name() {
		return "300ml Pepsi";
	}

	@Override
	public String size() {
		return "Small Pepsi";
	}

	@Override
	public float price() {
		return 25.0f;
	}
}
