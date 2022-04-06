package com.designpatterns.creational.singleton.doublecheckedlocking;

public class ExampleSingleton {

	private volatile static ExampleSingleton singletonInstance = null;

	private int data = 0;

	private ExampleSingleton() {
		System.out.println("Inside");
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	/**
	 * Thread safe - synchronized But synchronized keyword is a overhead - all the
	 * threads need to wait even after the instance is created Basically we need
	 * synchronized only for the first time when the object is created So do double
	 * checked locking
	 * 
	 * @return
	 */
	public static ExampleSingleton getInstance() {
		if (singletonInstance == null) {
			synchronized (ExampleSingleton.class) {
				if (singletonInstance == null) {
					singletonInstance = new ExampleSingleton();
				}
			}

		}
		return singletonInstance;

	}

}
