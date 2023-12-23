package org.example;

public class Car extends Toys {


    public Car(String name, int count) {
        super(name, count);
    }

    public String getInfo() {
        int weight = 15;
        return String.format("%s  Weight: %d",super.getInfo(), weight);
    }
}

