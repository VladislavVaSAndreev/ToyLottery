package org.example;

public class Soldier extends Toys {

int count = 4;

    public Soldier(String name, int count) {
        super(name, count);
    }

    public String getInfo() {
        int weight = 5;
        return String.format("%s  Weight: %d", super.getInfo(), weight);
    }
}

