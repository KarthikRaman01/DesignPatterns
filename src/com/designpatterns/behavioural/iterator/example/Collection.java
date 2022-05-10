package com.designpatterns.behavioural.iterator.example;

import java.util.ArrayList;
import java.util.LinkedList;

public interface Collection {

	Iterator createIterator();

}

class ArtsCollection implements Collection {

	ArrayList<String> artSubjects;

	public ArtsCollection() {
		this.artSubjects = new ArrayList<String>();
		artSubjects.add("Art Subject 1");
		artSubjects.add("Art Subject 2");
		artSubjects.add("Art Subject 3");
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ArtsIterator(artSubjects);
	}

}

class ScienceCollection implements Collection {
	LinkedList<String> scienceSubjects;

	public ScienceCollection() {
		this.scienceSubjects = new LinkedList<String>();
		scienceSubjects.add("Science Subject 1");
		scienceSubjects.add("Science Subject 2");
		scienceSubjects.add("Science Subject 3");
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ScienceIterator(scienceSubjects);
	}
}
