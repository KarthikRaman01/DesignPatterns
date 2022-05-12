package com.designpatterns.behavioural.observer;

public interface Observer {

	// method to update the observer used by subject
	public void update();

	// not required but to query the subject
	public void setSubject(Subject sub);

}

class MyTopicObserver implements Observer {

	Subject myTopic;

	public MyTopicObserver(Subject myTopic) {
		this.myTopic = myTopic;
	}

	@Override
	public void update() {
		this.myTopic.getUpdate(this);

		System.out.println("An update has occured and Observer1 got it");

	}

	@Override
	public void setSubject(Subject sub) {
		this.myTopic = sub;
	}

	public void getMessage() throws InterruptedException {
		while (true) {
			Thread.sleep(2000);
			System.out.println(this.myTopic.getUpdate(this));
		}

	}

}

class Observer2 implements Observer {

	Subject subject;

	@Override
	public void update() {
		//The message can be passed here --> push method
		System.out.println("An update has occured and Observer2 got it");

	}

	@Override
	public void setSubject(Subject sub) {
		this.subject = sub;

	}

}
