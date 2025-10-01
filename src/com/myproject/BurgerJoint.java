package com.myproject;

public class BurgerJoint extends FastFood {
    private String special;

    public BurgerJoint(String name, double price, String special) {
        super(name, price);
        this.special = special;
    }

    public void printSpecial() {
        System.out.println("House special: " + special);
    }
}