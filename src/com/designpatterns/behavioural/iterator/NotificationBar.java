package com.designpatterns.behavioural.iterator;

public class NotificationBar {

	NotificationCollection notifications;

	public NotificationBar(NotificationCollection notifications) {
		this.notifications = notifications;
	}
	
	public void printNotifications() {
		Iterator iterator = notifications.createIterator();
		while(iterator.hasNext()) {
			Notification not = (Notification) iterator.next();
			System.out.println(not.getNotification());
		}
	}

}
