package com.designpatterns.creational.factory.concretecreator;

public class Rectangle implements Shape {

	@Override
	public void area() {
		System.out.println("Rectangle area - length * breadth");
	}

}
