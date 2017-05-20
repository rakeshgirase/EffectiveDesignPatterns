package com.exuberant.tutorials.designpattern.composite;
import java.util.LinkedList;
import java.util.List;

public class Composite {
	private static void printSize(final DiskObject d) {
		System.out.printf("The size is %d%n", d.getSize());
	}

	public static void main(final String[] args) {
		Directory d1 = new Directory();
		d1.children.add(new File("f1", 50));
		d1.children.add(new File("f2", 30));
		Directory d2 = new Directory();
		d2.children.add(new File("f1", 100));
		d2.children.add(d1);
		printSize(d2);
	}
}
