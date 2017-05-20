package com.exuberant.tutorials.designpattern.composite;

/**
 * Created by rakesh on 20-05-2017.
 */
public class File implements DiskObject {
	private final String name;
	private final int size;

	public File(final String name, final int size) {
		this.name = name;
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public String getName() {
		return name;
	}
}
