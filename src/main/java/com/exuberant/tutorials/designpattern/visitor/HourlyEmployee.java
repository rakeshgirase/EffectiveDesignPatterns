package com.exuberant.tutorials.designpattern.visitor;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

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
