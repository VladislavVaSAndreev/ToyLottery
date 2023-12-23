package org.example;

public class Doll extends Toys {


    public Doll(String name, int count) {
        super(name, count);
    }

    public String getInfo() {
        int weight = 20;
        return String.format("%s  Weight: %d",super.getInfo(), weight);
    }
}

