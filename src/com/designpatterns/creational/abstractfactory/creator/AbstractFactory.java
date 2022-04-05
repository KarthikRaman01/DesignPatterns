package com.designpatterns.creational.abstractfactory.creator;

public abstract class AbstractFactory {

	abstract Shape getShape(String shape);

	abstract Color getColor(String color);

}
