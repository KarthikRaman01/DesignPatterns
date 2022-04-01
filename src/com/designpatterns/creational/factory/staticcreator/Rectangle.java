package com.designpatterns.creational.factory.staticcreator;

public class Rectangle implements Shape {

	@Override
	public void area() {
		System.out.println("Rectangle area - length * breadth");
	}

}
