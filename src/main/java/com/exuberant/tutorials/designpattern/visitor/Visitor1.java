package com.exuberant.tutorials.designpattern.visitor;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Visitor1 {
    public static void main(final String[] args) throws Exception {
        List<Employee> e = new LinkedList<Employee>();
        e.add(new HourlyEmployee("bob", 10));
        e.add(new SalariedEmployee("sam", 500));
        EmployeeReportVisitor erv = new EmployeeReportVisitor();
        erv.printEmployees(e);
        getString(null);
        UserAuthenticator userAuthenticator = new UserAuthenticator();
        List<Employee> employees = new Vector<>();
        List<Employee> vector = new Vector<>();
        Set<Employee> set = new HashSet<>();
        Map<String,Employee> cache = new ConcurrentHashMap<>();

        try (InputStream inputStream = new FileInputStream("XYZ.txt")) {
            System.err.println("inputStream" + inputStream);
            userAuthenticator.isValidUser("rakesh", "P@ssw0rd");
        } catch (InvalidUsernamePasswordException | Exception e1) {
            System.err.println("Throwing exception!!!");
        } finally {
            System.err.println("Inside Finally!!");
        }
    }

    private static void displayExceptionMessage(String message) {
        System.err.println(message);
    }

    public static void getString(String string) {
        if (string != null) {
            System.err.println("Length: " + string.length());
        }
    }
}
