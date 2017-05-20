package com.exuberant.tutorials.designpattern.interpreter;

/**
 * Created by rakesh on 20-05-2017.
 */
class ColorSpec implements Spec {
	int color;

	public ColorSpec(final int color) {
		this.color = color;
	}

	@Override
	public boolean isSatisfiedBy(final Product p) {
		return p.color == color;
	}
}
