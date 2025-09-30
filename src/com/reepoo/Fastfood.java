package com.reepoo;

public class FastFood {
    protected String name;

    public FastFood(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Static factory methods for common fast food places
    public static FastFood mcdonalds() {
        return new FastFood("McDonald");
    }

    public static FastFood wendys() {
        return new FastFood("wendys");
    }

    public static FastFood burgerKing() {
        return new FastFood("Burger King");
    }

    public static FastFood arbys() {
        return new FastFood("Arbys");
    }

    public static FastFood kfc() {
        return new FastFood("KFC");
    }
}