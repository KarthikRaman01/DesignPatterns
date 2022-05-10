package com.designpatterns.behavioural.iterator;

public interface Iterator {

	boolean hasNext();

	Object next();
}

class NotificationIterator implements Iterator {
	Notification[] notifications;

	// maintains current position of the iterator over array
	int pos = 0;

	public NotificationIterator(Notification[] notifications) {
		this.notifications = notifications;
	}

	@Override
	public boolean hasNext() {
		if (pos >= notifications.length || notifications[pos] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		Notification notification = notifications[pos];
		pos = pos + 1;
		return notification;

	}

}
