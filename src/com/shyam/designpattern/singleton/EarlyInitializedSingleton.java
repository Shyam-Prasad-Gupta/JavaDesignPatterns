package com.shyam.designpattern.singleton;

public class EarlyInitializedSingleton {

	private static EarlyInitializedSingleton eis = new EarlyInitializedSingleton();//instance will be created at class loading

	private EarlyInitializedSingleton() {
	}

	public static EarlyInitializedSingleton getInstance() {
		return eis;
	}
}
