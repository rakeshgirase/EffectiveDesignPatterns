package com.exuberant.tutorials.designpattern.state;

public class State1 {
	public static void main(final String[] args) {
		GumballMachine g = new GumballMachine(2);
		g.coinInstered();
		g.leverTurned();
		g.coinInstered();
		g.leverTurned();
		g.coinInstered();
		g.leverTurned();
	}
}
