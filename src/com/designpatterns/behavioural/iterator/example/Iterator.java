package com.designpatterns.behavioural.iterator.example;

import java.util.ArrayList;
import java.util.LinkedList;

public interface Iterator {

	boolean hasNext();

	String next();

	void first();

	String currentItem();

}

class ArtsIterator implements Iterator {

	int pos = 0;

	ArrayList<String> artSubjects;

	public ArtsIterator(ArrayList<String> artSubjects) {
		this.artSubjects = artSubjects;
	}

	@Override
	public boolean hasNext() {
		if (pos >= artSubjects.size() || artSubjects.get(pos) == null) {
			return false;
		}
		return true;

	}

	@Override
	public String next() {
		String artSubject = artSubjects.get(pos);
		pos = pos + 1;
		return artSubject;
	}

	@Override
	public void first() {
		pos = 0;
	}

	@Override
	public String currentItem() {
		return artSubjects.get(pos);
	}

}

class ScienceIterator implements Iterator {
	int pos = 0;

	LinkedList<String> scienceSubjects;

	public ScienceIterator(LinkedList<String> scienceSubjects) {
		this.scienceSubjects = scienceSubjects;
	}

	@Override
	public boolean hasNext() {
		if (pos >= scienceSubjects.size() || scienceSubjects.get(pos) == null) {
			return false;
		}
		return true;

	}

	@Override
	public String next() {
		String scienceSubject = scienceSubjects.get(pos);
		pos = pos + 1;
		return scienceSubject;
	}

	@Override
	public void first() {
		pos = 0;
	}

	@Override
	public String currentItem() {
		return scienceSubjects.get(pos);
	}
}
