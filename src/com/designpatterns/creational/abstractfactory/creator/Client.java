package com.designpatterns.creational.abstractfactory.creator;

public class Client {

	public static void main(String[] args) {
		//use the static producer
		FactoryProducer.getFactory("color").getColor("red").fill();
		FactoryProducer.getFactory("shape").getShape("square").area();
		
		// concrete methodology
		new AbstractFactoryProducer().getAbstractFactory("color").getColor("green").fill();
		
	}

}
