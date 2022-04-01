package com.designpatterns.creational.factory.staticcreator;

public class StaticShapeFactory {

	/**
	 * Just a normal class and based on the string, create an object
	 * @param shape
	 * @return
	 */
	public static Shape getShape(String shape) {
		if (null != shape && !shape.isEmpty()) {
			switch (shape) {
			case "circle":
				return new Circle();
			case "rectangle":
				return new Rectangle();
			default:
				return new Rectangle();
			}
		}

		return null;
	}

}
