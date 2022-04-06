package com.designpatterns.creational.singleton.eagerevaluation;

public class ExampleSingleton {

	// created even if this class is not used
	// instance created during the class initialization
	private static ExampleSingleton singletonInstance = new ExampleSingleton();

	private ExampleSingleton() {
		System.out.println("Inside");
	}

	public static ExampleSingleton getInstance() {
		return singletonInstance;

	}

}
