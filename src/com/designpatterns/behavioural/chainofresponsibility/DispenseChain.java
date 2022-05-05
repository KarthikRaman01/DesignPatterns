package com.designpatterns.behavioural.chainofresponsibility;

public interface DispenseChain {
	void dispense(Currency cur);

	void setNextChain(DispenseChain nextChain);
}


class DollarValidator implements DispenseChain {
	DispenseChain chain;

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() % 10 == 0) {
			this.chain.dispense(cur);
		} else {
			System.out.println("Can't dispense - Needs to be a multiple of 10");
			return;
		}
	}

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;

	}

}

class Dollar50Dispensor implements DispenseChain {
	DispenseChain chain;

	@Override
	public void dispense(Currency cur) {
		int amount = cur.getAmount();
		if (cur.getAmount() >= 50) {
			int numberOfBills = amount / 50;
			int remainderAmount = amount % 50;
			System.out.println("Dispensing amount: " + numberOfBills * 50);
			System.out.println("Dispensing bills: " + numberOfBills);
			if (remainderAmount != 0) {
				this.chain.dispense(new Currency(remainderAmount));
			}
		} else {
			this.chain.dispense(cur);
		}
	}

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;

	}

}

class Dollar20Dispensor implements DispenseChain {

	DispenseChain chain;

	@Override
	public void dispense(Currency cur) {
		int amount = cur.getAmount();
		if (cur.getAmount() >= 20) {
			int numberOfBills = amount / 20;
			int remainderAmount = amount % 20;
			System.out.println("Dispensing amount: " + numberOfBills * 20);
			System.out.println("Dispensing bills: " + numberOfBills);
			if (remainderAmount != 0) {
				this.chain.dispense(new Currency(remainderAmount));
			}
		} else {
			this.chain.dispense(cur);
		}

	}

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;

	}

}

class Dollar10Dispensor implements DispenseChain {

	DispenseChain chain;

	@Override
	public void dispense(Currency cur) {
		int amount = cur.getAmount();
		if (cur.getAmount() >= 10) {
			int numberOfBills = amount / 10;
			int remainderAmount = amount % 10;
			System.out.println("Dispensing amount: " + numberOfBills * 10);
			System.out.println("Dispensing bills: " + numberOfBills);
			if (remainderAmount != 0) {
				this.chain.dispense(new Currency(remainderAmount));
			}
		} else {
			this.chain.dispense(cur);
		}

	}

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;

	}

}
