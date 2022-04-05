package com.designpatterns.creational.abstractfactory.creator.example;

public interface AbstractFurnitureFactory {

	Chair createChair();

	Sofa createSofa();

}

class VictorianFurnitureFactory implements AbstractFurnitureFactory {

	@Override
	public Chair createChair() {
		// TODO Auto-generated method stub
		return new VictorianChair();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new VictorianSofa();
	}

}

class ModernFurnitureFactory implements AbstractFurnitureFactory {

	@Override
	public Chair createChair() {
		// TODO Auto-generated method stub
		return new ModernChair();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new ModernSofa();
	}

}
