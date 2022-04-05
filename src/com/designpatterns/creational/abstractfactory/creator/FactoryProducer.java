package com.designpatterns.creational.abstractfactory.creator;

/**
 * Factory producer class that gives the right factory needed 
 * - shape factory or color factory
 * client uses this method to get the right factory
 * @author Karthik
 *
 */
public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Shape")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("Color")) {
			return new ColorFactory();
		} else {
			return null;
		}

	}
}


