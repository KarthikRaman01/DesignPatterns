package com.designpatterns.creational.factory.abstractcreator;

//DisAdvantage is that the subclasses need to be created for every child class of
//the interface - very strict - this is how the gang of 4 designed
abstract class AbstractShapeFactory {
	protected abstract Shape factoryMethod();

	public Shape getShape() {
		return factoryMethod();
	}

	// other helper methods if needed can be added here
}

class RectangleFactory extends AbstractShapeFactory {

	/**
	 * factory method used to create rectangle objects
	 */
	@Override
	protected Shape factoryMethod() {
		// TODO Auto-generated method stub
		return new Rectangle();
	}

}

class CircleFactory extends AbstractShapeFactory {

	/**
	 * factory method used to create circle objects
	 */
	@Override
	protected Shape factoryMethod() {
		// TODO Auto-generated method stub
		return new Circle();
	}

}

class SquareFactory extends AbstractShapeFactory {
	/**
	 * factory method used to create square objects
	 */
	@Override
	protected Shape factoryMethod() {
		// TODO Auto-generated method stub
		return new Square();
	}

}
