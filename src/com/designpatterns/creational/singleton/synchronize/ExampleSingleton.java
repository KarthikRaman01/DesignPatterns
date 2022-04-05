package com.designpatterns.creational.singleton.synchronize;

public class ExampleSingleton {

	private static ExampleSingleton singletonInstance = null;

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

	/**
	 * Thread safe - if two threads call the same method at the same time - there is a chance that 2 objects would be created
	 * And if we maintain the state with this instance - like in this example - data, then it would be a problem
	 * if the object creates connections, then there will be 2 connections
	 * if a counter is used, there will be 2 counters
	 * So synchronized
	 * @return
	 */
	public static synchronized ExampleSingleton getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new ExampleSingleton();
		}
		return singletonInstance;

	}

}
