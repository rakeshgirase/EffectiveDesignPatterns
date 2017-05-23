package com.exuberant.tutorials.designpattern.visitor;

import java.util.List;

class EmployeeReportVisitor implements EmployeeVisitor {
	void printEmployees(final List<Employee> all) {
		for (Employee e : all)
			e.visit(this);
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
