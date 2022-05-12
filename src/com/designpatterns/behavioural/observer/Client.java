package com.designpatterns.behavioural.observer;

public class Client {

	public static void main(String[] args) {
		MyTopic subject = new MyTopic();

		Observer obs1 = new MyTopicObserver(subject);
		obs1.setSubject(subject);

		Observer obs2 = new Observer2();
		obs2.setSubject(subject);

		MyTopicObserver obs3 = new MyTopicObserver(subject);
		obs3.setSubject(subject);

		subject.registerObserver(obs1);
		subject.registerObserver(obs2);
		subject.registerObserver(obs3);

		subject.postMessage("Hello everyone");

		subject.postMessage("Get Guys");

		try {
			obs3.getMessage();
		} catch (InterruptedException e) {
			System.out.println("Exception catched");
		}

	}

}
