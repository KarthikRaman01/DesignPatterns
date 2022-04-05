package com.designpatterns.creational.singleton.synchronize;

public class ExampleSingleton {

	private static ExampleSingleton singletonInstance;

	private ExampleSingleton() {
		System.out.println("Inside");
	}

	public static synchronized ExampleSingleton getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new ExampleSingleton();
		}
		return singletonInstance;

	}

}
