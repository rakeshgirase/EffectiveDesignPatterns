package com.exuberant.tutorials.designpattern.state;

/**
 * Created by rakesh on 20-05-2017.
 */
class SoldOutState extends State {
	SoldOutState(final GumballMachine g) {
		super(g);
	}

	@Override
	State coinInserted() {
		System.out.println("Coin refund");
		return this;
	}
}
