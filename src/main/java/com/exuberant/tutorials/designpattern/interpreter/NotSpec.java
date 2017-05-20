package com.exuberant.tutorials.designpattern.interpreter;

/**
 * Created by rakesh on 20-05-2017.
 */
public class NotSpec implements Spec {
	Spec s;

	public NotSpec(final Spec s) {
		this.s = s;
	}

	@Override
	public boolean isSatisfiedBy(final Product p) {
		return !s.isSatisfiedBy(p);
	}
}
