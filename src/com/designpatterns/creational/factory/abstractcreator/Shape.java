package com.designpatterns.creational.factory.abstractcreator;

interface Shape {
	void draw();
}

/**
 * Just for simplicity, writing all the classes here - but usually to be separated out
 * @author Karthik
 *
 */
class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle:draw() method");
	}

}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle:draw() method");
	}

}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square:draw() method");
	}

}
