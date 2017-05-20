package com.exuberant.tutorials.designpattern.state;

/**
 * Created by rakesh on 20-05-2017.
 */
class GumballMachine {
	private int gumballs;
	State s = new NoQuaterState(this);

	GumballMachine(final int gumballs) {
		this.gumballs = gumballs;
	}

	void coinInstered() {
		s = s.coinInserted();
	}

	void leverTurned() {
		s = s.leverTurned();
	}

	void ejectPressed() {
		s = s.ejectPressed();
	}

	boolean hasGumballs() {
		gumballs--;
		return gumballs > 0;
	}
}
