package com.myproject;

public class FastFood {
    protected String name;
    protected double price;

    public FastFood(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void printName() {
        System.out.println("Fast food place: " + name);
    }

    public void printPrice() {
        System.out.println("Price: $" + price);
    }
}