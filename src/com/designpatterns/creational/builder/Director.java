package com.designpatterns.creational.builder;

public class Director {
	
	VehicleBuilder builder;
	
	public Director(VehicleBuilder builder) {
		this.builder = builder;
	}

	void construct() {
		builder.buildBody();
		builder.buildHeadLights();
		builder.buildWheels();
	}
}
