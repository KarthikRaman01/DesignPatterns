package com.designpatterns.creational.singleton.billpugh;

public class ExampleSingleton {

	private int data = 0;

	private ExampleSingleton() {
		System.out.println("Inside");
	}

	private static class ExampleSingletonHelper {
		// Nested class is referenced after getInstance is called
		// This is not loaded until getInstance() is called
		private static final ExampleSingleton singletonInstance = new ExampleSingleton();
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public static ExampleSingleton getInstance() {
		return ExampleSingletonHelper.singletonInstance;

	}

}
