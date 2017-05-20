package com.exuberant.tutorials.designpattern.iterator;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Iterator;

/**
 * Created by rakesh on 20-05-2017.
 */
class IntRange implements Iterable<Integer> {
	private final int lower, upper;

	public IntRange(int lower, int upper) {
		this.lower = lower;
		this.upper = upper;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			int current = lower;

			@Override
			public boolean hasNext() {
				return current <= upper;
			}

			@Override
			public Integer next() {
				return current++;
			}

			@Override
			public void remove() {
				throw new NotImplementedException();
			}
		};
	}
}
