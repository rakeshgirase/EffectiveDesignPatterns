package com.exuberant.tutorials.designpattern.visitor;

import java.util.List;

/**
 * Created by rakesh on 20-05-2017.
 */
class EmployeeReportVisitor implements EmployeeVisitor {
	void printEmployees(final List<Employee> all) {
		for (Employee e : all)
			e.visit(this);
		System.err.println("Hi");
	}

	@Override
	public void visit(final HourlyEmployee e) {
		System.out.printf("Hourly %s worked for %d hours", e.name, e.hours);
	}

	@Override
	public void visit(final SalariedEmployee e) {
		System.out.printf("Salaried %s has salary %d", e.name, e.salary);
	}
}
