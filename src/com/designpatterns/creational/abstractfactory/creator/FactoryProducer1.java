package com.designpatterns.creational.abstractfactory.creator;

/**
 * Factory producer class that gives the right factory needed 
 * - shape factory or color factory
 * client uses this method to get the right factory
 * clients need to create an object to call this
 * @author Karthik
 *
 */
public abstract class FactoryProducer1 {

	abstract AbstractFactory factoryMethod(String choice);

	AbstractFactory getAbstractFactory(String choice) {
		return factoryMethod(choice);
	}

}

class AbstractFactoryProducer extends FactoryProducer1 {

	@Override
	AbstractFactory factoryMethod(String choice) {
		if (choice.equalsIgnoreCase("Shape")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("Color")) {
			return new ColorFactory();
		} else {
			return null;
		}
	}

}