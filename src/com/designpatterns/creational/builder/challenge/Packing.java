package com.designpatterns.creational.builder.challenge;

public interface Packing {

	String pack();

}

class Wrapper implements Packing {

	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return "wrapper";
	}

}

class Bottle implements Packing {

	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return "bottle";
	}

}
