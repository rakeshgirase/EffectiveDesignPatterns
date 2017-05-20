package com.exuberant.tutorials.designpattern.interpreter;

/**
 * Created by rakesh on 20-05-2017.
 */
class BelowPrice implements Spec {
	int price;

	public BelowPrice(final int price) {
		this.price = price;
	}

	@Override
	public boolean isSatisfiedBy(final Product p) {
		return p.price < price;
	}
}
