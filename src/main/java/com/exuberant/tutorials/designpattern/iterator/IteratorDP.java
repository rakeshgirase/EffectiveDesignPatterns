package com.exuberant.tutorials.designpattern.iterator;
import java.util.Iterator;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class IteratorDP {
	public static void main(String[] args) {
		for (int n : new IntRange(2, 10))
			System.out.println(n);
	}
}
