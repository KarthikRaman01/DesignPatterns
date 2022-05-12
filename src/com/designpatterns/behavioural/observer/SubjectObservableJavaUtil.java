package com.designpatterns.behavioural.observer;

import java.util.Observable;
import java.util.Observer;

public class SubjectObservableJavaUtil extends Observable {

	public void addObserver(Observer obs) {
		super.addObserver(obs);
	}

	public void deleteObserver(Observer obs) {
		super.deleteObserver(obs);

	}

	public void notifyObservers() {
		super.notifyObservers();
	}

}

class ConcreteObserver implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

}
