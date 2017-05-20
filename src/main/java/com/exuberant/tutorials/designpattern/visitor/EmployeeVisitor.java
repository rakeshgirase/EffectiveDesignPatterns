package com.exuberant.tutorials.designpattern.visitor;

/**
 * Created by rakesh on 20-05-2017.
 */
interface EmployeeVisitor {
	void visit(HourlyEmployee e);

	void visit(SalariedEmployee e);
}
