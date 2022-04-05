package com.designpatterns.creational.singleton.lazy;

public class Client {

	public static void main(String[] args) {
		ExampleSingleton.getInstance();
		ExampleSingleton.getInstance();
		ExampleSingleton.getInstance();

		ExampleSingleton instance = ExampleSingleton.getInstance();
		instance.setData(100);

		System.out.println(instance.getData());

		instance = null;
		instance = ExampleSingleton.getInstance();
		//same data - so the same instance
		System.out.println(instance.getData());

	}

}
