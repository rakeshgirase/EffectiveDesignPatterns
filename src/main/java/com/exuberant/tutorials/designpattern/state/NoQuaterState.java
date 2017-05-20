package com.exuberant.tutorials.designpattern.state;

/**
 * Created by rakesh on 20-05-2017.
 */
class NoQuaterState extends State {
	NoQuaterState(final GumballMachine g) {
		super(g);
	}

	@Override
	State coinInserted() {
		return new HasQuaterState(g);
	}
}
