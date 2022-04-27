package com.designpatterns.creational.builder;

/**
 * Builder Interface - example vehicle Builder
 * @author Karthik
 *
 */
public interface VehicleBuilder {
	
	void buildBody();
	
	void buildHeadLights();
	
	void buildWheels();
	
	Product getProduct();

}
