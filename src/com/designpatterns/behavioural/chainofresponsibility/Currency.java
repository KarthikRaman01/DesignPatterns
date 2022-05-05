package com.designpatterns.behavioural.chainofresponsibility;

public class Currency {

	int amount;

	public Currency(int amt) {
		this.amount = amt;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
