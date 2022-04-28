package com.designpatterns.creational.builder.challenge;

public class Client {

	public static void main(String args[]) {
		VeggieMeal vegMeal = new VeggieMeal();
		DirectorMeal direct = new DirectorMeal(vegMeal);
		direct.constructMeal();
		System.out.println("Cost of the Veg Meal: " + vegMeal.getMeal().getCost());
		vegMeal.getMeal().showItems();
	}
}
