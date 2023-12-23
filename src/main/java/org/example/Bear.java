package org.example;

public class Bear extends Toys {


    public Bear(String name, int count) {
        super(name, count);
    }

    public String getInfo() {
        int weight = 10;
        return String.format("%s  Weight: %d",super.getInfo(), weight);
    }
}