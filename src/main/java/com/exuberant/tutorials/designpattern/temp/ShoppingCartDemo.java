package com.exuberant.tutorials.designpattern.temp;

/**
 * Created by rakesh on 08-Jul-2017.
 */
public class ShoppingCartDemo {

    public static final String APPLE = "APPLE";
    public static final String MANGO = "MANGO";
    public static final String BANANA = "BANANA";

    public static void main(String[] args) {
        ShoppingCart<Costable> fruitCart = new ShoppingCart();
        Fruit f1 = new Fruit(APPLE, 10);
        Fruit f2 = new Fruit(APPLE, 12);
        Fruit f3 = new Fruit(APPLE, 15);
        Fruit f4 = new Fruit(APPLE, 15);
        Fruit f5 = new Fruit(APPLE, 13);
        Fruit f6 = new Fruit(MANGO, 10);
        Fruit f7 = new Fruit(MANGO, 12);
        Fruit f8 = new Fruit(MANGO, 15);
        Fruit f9 = new Fruit(BANANA, 15);
        Fruit f10 = new Fruit(BANANA, 13);
        fruitCart.add(f1);
        fruitCart.add(f2);
        fruitCart.add(f3);
        fruitCart.add(f4);
        fruitCart.add(f5);
        fruitCart.add(f6);
        fruitCart.add(f7);
        fruitCart.add(f8);
        fruitCart.add(f9);
        fruitCart.add(f10);
        fruitCart.printTotalCost();

    }
}
