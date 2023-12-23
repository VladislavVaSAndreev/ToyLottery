package org.example;

import java.util.Random;

public class Toys {
    protected static int nameId;
    protected static Random r;
    protected static int weight;
    protected String name;
    protected int count;

    static {
        Toys.nameId = 0;
        Toys.r = new Random();
    }

    public Toys(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getInfo() {
        return String.format("Name: %s  Pcs: %d  Type: %s",
                this.name, this.count, this.getClass().getSimpleName());
    }
}
