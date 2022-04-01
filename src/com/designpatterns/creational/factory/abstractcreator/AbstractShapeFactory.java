package com.designpatterns.creational.factory.abstractcreator;

abstract class AbstractShapeFactory {
	protected abstract Shape factoryMethod();

	public Shape getShape() {
		return factoryMethod();
	}

	// other helper methods if needed can be added here
}

// DisAdv, is that the subclasses need to be created for every child class of
// the interface
class RectangleFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		// TODO Auto-generated method stub
		return new Rectangle();
	}

}

class CircleFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		// TODO Auto-generated method stub
		return new Circle();
	}

}

class SquareFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		// TODO Auto-generated method stub
		return new Square();
	}

}
