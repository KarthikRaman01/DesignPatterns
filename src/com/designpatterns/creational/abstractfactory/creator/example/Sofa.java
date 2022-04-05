package com.designpatterns.creational.abstractfactory.creator.example;

public interface Sofa {
	void hasLegs();

	void sitOn();
}

class VictorianSofa implements Sofa{

	@Override
	public void hasLegs() {
		System.out.println("Yes, Victorian Sofa has legs");
		
	}

	@Override
	public void sitOn() {
		System.out.println("Yes, you can siton and sleepon Victorian Sofa");
		
	}
	
}


class ModernSofa implements Sofa{

	@Override
	public void hasLegs() {
		System.out.println("Yes, Victorian Sofa has legs");
		
	}

	@Override
	public void sitOn() {
		System.out.println("Yes, you can siton and sleepon Victorian Sofa");
		
	}
	
}
