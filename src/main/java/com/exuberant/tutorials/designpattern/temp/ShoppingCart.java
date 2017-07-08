package com.exuberant.tutorials.designpattern.temp;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart<T extends Costable> {

    private Map<T, Integer> data = new HashMap();

    public void add(T t) {
        if (data.containsKey(t)) {
            Integer currentCount = data.get(t);
            data.put(t, ++currentCount);
        } else {
            data.put(t, 1);
        }
    }

    public void remove(T t) {
        if (data.containsKey(t)) {
            Integer currentCount = data.get(t);
            if (currentCount > 1) {
                data.put(t, --currentCount);
            } else {
                data.remove(t);
            }
        } else {
            throw new InvalidOperation("Cannot remove " + t + " as it doesnt exist in the cart!!!");
        }
    }

    public void display() {
        System.err.println("Cart Items: " + data);
    }

    public void printTotalCost() {
        double totalCost = 0;
        for (T t : data.keySet()) {
            totalCost += t.getCost();
        }
        System.err.println("Total Cart Cost is: " + totalCost);
    }
}
