package com.designpatterns.creational.prototype;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String, Shape> shapes = new Hashtable<>();

	public static Shape getShape(String id) {
		Shape shape = shapes.get(id);
		return (Shape) shape.clone();
	}

	public static void loadCache() {
		Rectangle rectangle = new Rectangle();
		rectangle.setId("1");

		Circle circle = new Circle();
		circle.setId("2");

		shapes.put(rectangle.getId(), rectangle);
		shapes.put(circle.getId(), circle);
	}

}
