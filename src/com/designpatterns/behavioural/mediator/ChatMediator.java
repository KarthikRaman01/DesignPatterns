package com.designpatterns.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public interface ChatMediator {
	public void addUser(User user);

	public void sendMessage(String message, User user);
}

class ChatMediatorImpl implements ChatMediator {
	List<User> users;

	public ChatMediatorImpl() {
		users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String message, User user) {
		for (User u : users) {
			if (u != user) {
				u.receiveMessage(message, u.getName());
			}
		}

	}

}
