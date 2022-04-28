package com.designpatterns.creational.builder.challenge;

public interface MealBuilder {

	void buildBurger();

	void buildDrink();

	Meal getMeal();

}

class VeggieMeal implements MealBuilder {

	Meal meal = new Meal();

	@Override
	public void buildBurger() {
		Item item = new VegBurger();
		meal.addItem(item);

	}

	@Override
	public void buildDrink() {
		Item item = new Pepsi();
		meal.addItem(item);

	}

	@Override
	public Meal getMeal() {
		// TODO Auto-generated method stub
		return meal;
	}

}

class NonVegMeal implements MealBuilder {

	Meal meal = new Meal();

	@Override
	public void buildBurger() {
		Item item = new ChickenBurger();
		meal.addItem(item);

	}

	@Override
	public void buildDrink() {
		Item item = new Coke();
		meal.addItem(item);

	}

	@Override
	public Meal getMeal() {
		// TODO Auto-generated method stub
		return meal;
	}

}
