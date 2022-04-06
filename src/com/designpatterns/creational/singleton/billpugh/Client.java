package com.designpatterns.creational.singleton.billpugh;

public class Client {

	public static void main(String[] args) {
		ExampleSingleton.getInstance();
		ExampleSingleton.getInstance();
		ExampleSingleton.getInstance();
	}

}
