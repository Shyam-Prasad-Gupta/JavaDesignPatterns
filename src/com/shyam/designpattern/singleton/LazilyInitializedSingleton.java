package com.shyam.designpattern.singleton;

public class LazilyInitializedSingleton {

	private static LazilyInitializedSingleton lis;

	private LazilyInitializedSingleton() {
	}

	public static LazilyInitializedSingleton getInstance() {

		if (lis == null) {
			synchronized (LazilyInitializedSingleton.class) {
				if (lis == null) {
					lis = new LazilyInitializedSingleton();
				}
			}
		}
		return lis;
	}
}
