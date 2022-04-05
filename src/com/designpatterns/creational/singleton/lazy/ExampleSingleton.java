package com.designpatterns.creational.singleton.lazy;

public class ExampleSingleton {

	// reference to the one and only instance
	private static ExampleSingleton singletonInstance = null;

	// an instance attribute
	private int data = 0;

	private ExampleSingleton() {
		System.out.println("Inside");
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public static ExampleSingleton getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new ExampleSingleton();
		}
		return singletonInstance;

	}

}
