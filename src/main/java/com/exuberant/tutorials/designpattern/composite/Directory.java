package com.exuberant.tutorials.designpattern.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by rakesh on 20-05-2017.
 */
public class Directory implements DiskObject {
	private String name;
	List<DiskObject> children = new LinkedList<DiskObject>();

	public Directory() {

	}

	public Directory(String name) {
		this.name = name;
	}

	public int getSize() {
		int sum = 0;
		for (DiskObject o : children)
			sum += o.getSize();
		return sum;
	}

	public String getName() {
		return name;
	}
}
