package com.shyam.designpattern.builder.beverages.pepsi;

public class LargePepsi extends Pepsi {

	@Override
	public String name() {
		return "1.5L Pepsi";
	}

	@Override
	public String size() {
		return "Large Pepsi";
	}

	@Override
	public float price() {
		return 60.0f;
	}
}
