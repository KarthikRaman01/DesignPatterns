package com.designpatterns.creational.abstractfactory.creator;

public interface Shape {
	void area();
}

class Rectangle implements Shape {

	@Override
	public void area() {
		System.out.println("length * breadth");

	}

}

class Square implements Shape {

	@Override
	public void area() {
		System.out.println("length * length");

	}

}
