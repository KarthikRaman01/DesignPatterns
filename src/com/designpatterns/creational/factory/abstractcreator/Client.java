package com.designpatterns.creational.factory.abstractcreator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape shape1 = new CircleFactory().getShape();
		shape1.draw();
		
		Shape shape2 = new RectangleFactory().getShape();
		shape2.draw();

	}

}
