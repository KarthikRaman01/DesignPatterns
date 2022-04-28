package com.designpatterns.creational.builder.challenge;

public interface Item {

	Float price();

	String name();

	Packing pack();

}

abstract class Burger implements Item {

	public Packing pack() {
		return new Wrapper();
	}

}

abstract class ColdDrinks implements Item {

	public Packing pack() {
		return new Bottle();
	}

}

class VegBurger extends Burger {

	@Override
	public Float price() {
		return 10.0F;
	}

	@Override
	public String name() {
		return "VeggieDelight";
	}

}

class ChickenBurger extends Burger {

	@Override
	public Float price() {
		return 10.0F;
	}

	@Override
	public String name() {
		return "ChickenDelight";
	}
}

class Pepsi extends ColdDrinks {
	@Override
	public Float price() {
		return 2.99F;
	}

	@Override
	public String name() {
		return "Pepsi";
	}
}

class Coke extends ColdDrinks {

	@Override
	public Float price() {
		return 1.99F;
	}

	@Override
	public String name() {
		return "Coke";
	}
}
