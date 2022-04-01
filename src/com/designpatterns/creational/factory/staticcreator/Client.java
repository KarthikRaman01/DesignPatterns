package com.designpatterns.creational.factory.staticcreator;

public class Client {

	public static void main(String[] args) {
		Shape s1 = StaticShapeFactory.getShape("circle");
		s1.area();

		Shape s2 = StaticShapeFactory.getShape("rectangle");
		s2.area();

		Shape s3 = StaticShapeFactory.getShape("random");
		s3.area();

	}

}
