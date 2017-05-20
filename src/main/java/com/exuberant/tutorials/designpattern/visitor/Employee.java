package com.exuberant.tutorials.designpattern.visitor;

/**
 * Created by rakesh on 20-05-2017.
 */
abstract class Employee {
	String name;

	Employee(final String name) {
		this.name = name;
	}

	abstract void visit(EmployeeVisitor ev);
}
