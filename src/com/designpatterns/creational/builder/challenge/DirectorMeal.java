package com.designpatterns.creational.builder.challenge;

public class DirectorMeal {

	MealBuilder mealBuilder;

	public DirectorMeal(MealBuilder builder) {
		this.mealBuilder = builder;
	}

	public void constructMeal() {
		mealBuilder.buildBurger();
		mealBuilder.buildDrink();
	}
}
