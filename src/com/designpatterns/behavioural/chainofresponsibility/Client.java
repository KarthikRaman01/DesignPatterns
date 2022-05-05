package com.designpatterns.behavioural.chainofresponsibility;

import java.util.Scanner;

public class Client {

	private DispenseChain chain1;

	public Client() {
		// initialize the chain
		this.chain1 = new DollarValidator();
		DispenseChain chain2 = new Dollar50Dispensor();
		DispenseChain chain3 = new Dollar20Dispensor();
		DispenseChain chain4 = new Dollar10Dispensor();
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
		chain3.setNextChain(chain4);

	}

	public static void main(String[] args) {
		Client client = new Client();
		int amount = new Scanner(System.in).nextInt();
		client.chain1.dispense(new Currency(amount));

	}

}
