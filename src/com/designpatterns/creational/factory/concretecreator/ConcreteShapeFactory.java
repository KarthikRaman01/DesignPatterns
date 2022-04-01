package com.designpatterns.creational.factory.concretecreator;

abstract class ConcreteShapeFactory {
	//factory method used to create objects but not visible to the clients
	abstract Shape factoryMethod(String shape);

	//visible to the clients
	public Shape getShape(String shape) {
		return factoryMethod(shape.toLowerCase());
	}

}

/**
 * This is the class that the client instantiates and calls
 * @author Karthik
 *
 */
class ConcreteSubClassFactory extends ConcreteShapeFactory {
	
	/**
	 * factory method used to create different objects based on string
	 */
	@Override
	Shape factoryMethod(String shape) {
		// TODO Auto-generated method stub
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
