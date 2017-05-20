package com.exuberant.tutorials.designpattern.flyweight;

/**
 * Created by rakesh on 20-05-2017.
 */
public class Point1 {
	private int x, y;

	public Point1(final int x, final int y) {
		super();
		this.x = x;
		this.y = y;
	}

	int getX() {
		return x;
	}

	void setX(final int x) {
		this.x = x;
	}

	int getY() {
		return y;
	}

	void setY(final int y) {
		this.y = y;
	}

	void move(final int dx, final int dy) {
		x += dx;
		y += dy;
	}
}
