package com.exuberant.tutorials.designpattern.visitor;

/**
 * Created by rakesh on 20-05-2017.
 */
class HourlyEmployee extends Employee {
	int hours;

	HourlyEmployee(final String name, final int hours) {
		super(name);
		this.hours = hours;
	}

	@Override
	void visit(final EmployeeVisitor ev) {
		ev.visit(this);
	}
}
