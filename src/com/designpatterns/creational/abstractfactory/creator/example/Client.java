package com.designpatterns.creational.abstractfactory.creator.example;

/**
 * please visit https://refactoring.guru/design-patterns/abstract-factory
 * 
 * @author Karthik
 *
 */
public class Client {

	public static void main(String[] args) {
		Chair chair = FactoryProducer.getFactory("victorian").createChair();
		chair.sitOn();
		chair.hasLegs();

		Chair chair2 = FactoryProducer.getFactory("modern").createChair();
		chair2.sitOn();
		chair2.hasLegs();

	}

}
