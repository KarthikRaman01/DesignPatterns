package com.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {

	// methods to register and unregister observer
	public void registerObserver(Observer obj);

	public void unRegisterObserver(Observer obj);

	// method to notify all the observers of change
	public void notifyObservers();

	// method to get updates from subject, not required
	// but added so observers can query the update
	public Object getUpdate(Observer obj);

}

class MyTopic implements Subject {

	private List<Observer> observers;
	private String message;
	private boolean changed;

	public MyTopic() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer obj) {
		if (obj != null && !observers.contains(obj)) {
			observers.add(obj);
		}

	}

	@Override
	public void unRegisterObserver(Observer obj) {
		observers.remove(obj);
	}

	@Override
	public void notifyObservers() {
		if (this.changed) {
			for (Observer o : observers) {
				o.update();
			}
		}
		this.changed = false;
	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}
	
	public void postMessage(String msg) {
		System.out.println("Message Posted: "  + msg);
		this.message = msg;
		this.changed = true;
		notifyObservers();
	}

}
