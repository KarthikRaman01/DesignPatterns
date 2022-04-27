package com.designpatterns.creational.builder;

public class Client {

	public static void main(String[] args) {
		CarBuilder carBuilder = new CarBuilder();
		Director director = new Director(carBuilder);
		director.construct();
		Product product = carBuilder.getProduct();
		System.out.println("Objects Inside: ");
		for (String s : product.get()) {
			System.out.println(s);
		}

		MotorBikeBuilder motorBikeBuilder = new MotorBikeBuilder();
		Director director1 = new Director(motorBikeBuilder);
		director1.construct();
		Product product1 = motorBikeBuilder.getProduct();
		System.out.println("Objects Inside: ");
		for (String s : product1.get()) {
			System.out.println(s);
		}

	}

}
