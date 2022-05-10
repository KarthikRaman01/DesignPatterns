package com.designpatterns.behavioural.iterator;

public interface Collection {
	public Iterator createIterator();
}

class NotificationCollection implements Collection {

	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	Notification[] notifications;

	public NotificationCollection() {
		notifications = new Notification[MAX_ITEMS];
		addItem("Notif1");
		addItem("Notif2");
		addItem("Notif3");

	}

	public void addItem(String notifMessage) {
		if (numberOfItems < MAX_ITEMS) {
			Notification notification = new Notification(notifMessage);
			notifications[numberOfItems] = notification;
			numberOfItems++;
		} else {
			System.out.println("Items exceeded");
		}

	}

	@Override
	public Iterator createIterator() {
		return new NotificationIterator(notifications);
	}

}
