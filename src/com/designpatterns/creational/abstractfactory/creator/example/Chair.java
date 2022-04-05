package com.designpatterns.creational.abstractfactory.creator.example;

public interface Chair {
	void hasLegs();

	void sitOn();
}

class VictorianChair implements Chair {

	@Override
	public void hasLegs() {
		System.out.println("Yes, Victorian Chair has legs");

	}

	@Override
	public void sitOn() {
		System.out.println("Yes, you can siton Victorian Chair");

	}

}

class ModernChair implements Chair {

	@Override
	public void hasLegs() {
		System.out.println("Yes, ModernChair has legs");

	}

	@Override
	public void sitOn() {
		System.out.println("Yes, you can siton ModernChair");

	}

}
