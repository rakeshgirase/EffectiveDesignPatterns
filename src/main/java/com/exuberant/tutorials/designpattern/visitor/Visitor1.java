package com.exuberant.tutorials.designpattern.visitor;
import java.util.LinkedList;
import java.util.List;

public class Visitor1 {
	public static void main(final String[] args) {
		List<Employee> e = new LinkedList<Employee>();
		e.add(new HourlyEmployee("bob", 10));
		e.add(new SalariedEmployee("sam", 500));
		EmployeeReportVisitor erv = new EmployeeReportVisitor();
		erv.printEmployees(e);
	}
}
