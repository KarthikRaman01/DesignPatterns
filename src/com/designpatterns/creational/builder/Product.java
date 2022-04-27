package com.designpatterns.creational.builder;

import java.util.LinkedList;

/**
 * Object that needs to be returned to the client
 * 
 * @author Karthik
 *
 */
public class Product {

	LinkedList<String> linkedlist = new LinkedList<>();

	public void add(String value) {
		linkedlist.addLast(value);
	}

	public LinkedList<String> get() {
		return linkedlist;
	}

}
