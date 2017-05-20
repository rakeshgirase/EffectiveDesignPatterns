package com.exuberant.tutorials.designpattern.visitor;

/**
 * Created by rakesh on 20-05-2017.
 */
class SalariedEmployee extends Employee {
	int salary;

	SalariedEmployee(final String name, final int salary) {
		super(name);
		this.salary = salary;
	}

	@Override
	void visit(final EmployeeVisitor ev) {
		ev.visit(this);
	}
}
