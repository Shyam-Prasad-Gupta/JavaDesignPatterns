package com.shyam.designpattern.builder.pizza;

import com.shyam.designpattern.builder.Item;

public abstract class Pizza implements Item{
	
	@Override
	public abstract float price();
}
