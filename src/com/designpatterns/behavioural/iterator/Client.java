package com.designpatterns.behavioural.iterator;

public class Client {

	public static void main(String[] args) {
		NotificationCollection nc = new NotificationCollection();
		NotificationBar bar = new NotificationBar(nc);
		bar.printNotifications();
		
		
		
		//Don't need the notificationBar
		NotificationCollection nc1 = new NotificationCollection();
		Iterator it = nc1.createIterator();
		while(it.hasNext()) {
			Notification noti = (Notification) it.next();
			System.out.println(noti.getNotification());
		}

	}

}
