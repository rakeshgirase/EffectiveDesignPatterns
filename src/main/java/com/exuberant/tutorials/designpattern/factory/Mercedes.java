package com.exuberant.tutorials.designpattern.factory;

public class Mercedes implements Car {
    private String name;

    public Mercedes(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.err.println("I am runing Mercedes " + name);
    }

}
