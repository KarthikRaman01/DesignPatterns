package com.designpatterns.creational.factory.concretecreator;

public class Client {

	public static void main(String[] args) {
		Shape s1 = new ConcreteSubClassFactory().getShape("circle");
		s1.area();
		
		Shape s2 = new ConcreteSubClassFactory().getShape("rectangle");
		s2.area();
		
		Shape s3 = new ConcreteSubClassFactory().getShape("random");
		s3.area();

	}

}
