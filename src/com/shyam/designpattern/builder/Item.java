package com.shyam.designpattern.builder;

public interface Item {
	//an interface can have only constants as instance fields means we can declare any field instance with public static final keywords only.
	//public static final int x = 100;
	
	public String name();
	public String size();
	public float price();
}
