package com.designpatterns.creational.abstractfactory.creator;

public class ColorFactory extends AbstractFactory {
	@Override
	Color getColor(String color) {
		if (null != color && !color.isEmpty()) {
			switch (color) {
			case "red":
				return new Red();
			case "green":
				return new Green();
			default:
				return new Red();
			}
		}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// Not a good design. This is a code smell. Shape has nothing
		// to do with Color
		return null;
	}
}
