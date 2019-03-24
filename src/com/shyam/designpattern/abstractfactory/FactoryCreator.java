package com.shyam.designpattern.abstractfactory;

public class FactoryCreator {

	public static AbstractFactory getFactory(String factory) {
		if (factory == null) {
			return null;
		}
		if (factory.equalsIgnoreCase("LOAN")) {
			return new LoanFactory();
		} else if (factory.equalsIgnoreCase("BANK")) {
			return new BankFactory();
		}
		return null;
	}
}
