package com.designpatterns.behavioural.mediator;

public abstract class User {
	private String name;

	ChatMediator mediator;

	public User(ChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	abstract void sendMessage(String message, User user);

	abstract void receiveMessage(String message, String name);

}

class UserImpl extends User {

	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	void sendMessage(String message, User user) {
		System.out.println("Message sent by: " + user.getName());
		mediator.sendMessage(message, user);

	}

	@Override
	void receiveMessage(String message, String name) {
		System.out.println("Received message by the user: " + name);
		System.out.println("Message: " + message);

	}

}
