package com.exuberant.tutorials.designpattern.state;

/**
 * Created by rakesh on 20-05-2017.
 */
class HasQuaterState extends State {
	HasQuaterState(final GumballMachine g) {
		super(g);
	}

	@Override
	State coinInserted() {
		System.out.println("Coin refund");
		return this;
	}

	@Override
	State leverTurned() {
		System.out.println("Gumball dispensed");
		if (hasGumballs())
			return new NoQuaterState(g);
		return new SoldOutState(g);
	}

	@Override
	State ejectPressed() {
		System.out.println("Coin refund");
		return new NoQuaterState(g);
	}
}
