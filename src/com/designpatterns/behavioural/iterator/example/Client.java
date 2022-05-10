package com.designpatterns.behavioural.iterator.example;

public class Client {

	public static void main(String args[]) {
		
		ScienceCollection sciences = new ScienceCollection();
		Iterator it = sciences.createIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArtsCollection arts = new ArtsCollection();
		Iterator it1 = arts.createIterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
	}

}
