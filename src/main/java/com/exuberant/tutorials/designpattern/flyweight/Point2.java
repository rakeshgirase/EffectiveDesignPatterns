package com.exuberant.tutorials.designpattern.flyweight;

/**
 * Created by rakesh on 20-05-2017.
 */
class Point2 {
	private final int x, y;

	public Point2(final int x, final int y) {
		super();
		this.x = x;
		this.y = y;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	Point2 move(final int dx, final int dy) {
		return new Point2(x + dx, y + dy);
	}
}
