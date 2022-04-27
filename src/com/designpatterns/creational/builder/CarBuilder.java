package com.designpatterns.creational.builder;

public class CarBuilder implements VehicleBuilder {

	private Product product = new Product();

	@Override
	public void buildBody() {
		product.add("Building the car body");

	}

	@Override
	public void buildHeadLights() {
		product.add("Building 2 car headlights");

	}

	@Override
	public void buildWheels() {
		product.add("Building 4 car wheels");

	}

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return product;
	}

}
