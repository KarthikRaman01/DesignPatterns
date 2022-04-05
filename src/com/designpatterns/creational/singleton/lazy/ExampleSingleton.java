package com.designpatterns.creational.singleton.lazy;

public class ExampleSingleton {

	private static ExampleSingleton singletonInstance;

	private ExampleSingleton() {
		System.out.println("Inside");
	}

	public static ExampleSingleton getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new ExampleSingleton();
		}
		return singletonInstance;

	}

}
