package com.designpatterns.creational.abstractfactory.creator.example;

public class FactoryProducer {

	static AbstractFurnitureFactory getFactory(String factoryType) {
		if (factoryType != null) {
			if(factoryType.equalsIgnoreCase("victorian")) {
				return new VictorianFurnitureFactory();
			}
			
			if(factoryType.equalsIgnoreCase("modern")) {
				return new ModernFurnitureFactory();
			}
		}
		return null;

	}

}
