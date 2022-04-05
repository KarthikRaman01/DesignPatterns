package com.designpatterns.creational.abstractfactory.creator;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		if (null != shape && !shape.isEmpty()) {
			switch (shape) {
			case "square":
				return new Square();
			case "rectangle":
				return new Rectangle();
			default:
				return new Square();
			}
		}
		return null;
	}

	@Override
	Color getColor(String color) {
		// Not a good design. This is a code smell. Color has nothing
		// to do with Shape
		return null;
	}

	

	

}
