package com.designpatterns.creational.builder;

public class MotorBikeBuilder implements VehicleBuilder {

	private Product product = new Product();

	@Override
	public void buildBody() {
		product.add("Building the motorbike body");

	}

	@Override
	public void buildHeadLights() {
		product.add("Building 1 bike headlight");

	}

	@Override
	public void buildWheels() {
		product.add("Building 2 bike wheels");

	}

	@Override
	public Product getProduct() {
		return product;
	}

}
