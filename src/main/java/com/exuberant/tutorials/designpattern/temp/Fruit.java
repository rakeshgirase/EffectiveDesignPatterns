package com.exuberant.tutorials.designpattern.temp;

public class Fruit implements Costable {

    private String name;
    private double cost;

    public Fruit(String name, double cost){
        this.name = name;
        this.cost = cost;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getCost() {
        return cost;
    }
}
