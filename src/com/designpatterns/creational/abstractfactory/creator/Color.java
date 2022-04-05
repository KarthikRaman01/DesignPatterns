package com.designpatterns.creational.abstractfactory.creator;

public interface Color {

	void fill();
}

class Red implements Color {

	@Override
	public void fill() {
		System.out.println(" Red Filled ");

	}

}

class Green implements Color {
	@Override
	public void fill() {
		System.out.println(" Green Filled ");

	}
}
