package com.myproject;

public class Main {
    public static void main(String[] args) {
        FastFood f = new FastFood("Generic Fast Food", 5.99);
        f.printName();
        f.printPrice();

        BurgerJoint b = new BurgerJoint("Burger King", 7.99, "Whopper");
        b.printName();
        b.printPrice();
        b.printSpecial();
    }
}