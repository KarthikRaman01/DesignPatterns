package com.designpatterns.creational.prototype;

public class Client {

	public static void main(String[] args) {
		ShapeCache cache = new ShapeCache();
		cache.loadCache();

		Shape clonedShape = cache.getShape("1");
		System.out.println("Id: " + clonedShape.getId());
		System.out.println("Type: " + clonedShape.getType());
		clonedShape.draw();
		
		Shape clonedShape2 = cache.getShape("2");
		System.out.println("Id: " + clonedShape2.getId());
		System.out.println("Type: " + clonedShape2.getType());
		clonedShape2.draw();

	}

}
