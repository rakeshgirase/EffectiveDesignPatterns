package com.exuberant.tutorials.designpattern.decorator;

public class Tea implements Beverages {

    Beverages bev;

    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Black Tea");

    }

}
