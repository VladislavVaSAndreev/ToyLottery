package org.example;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) throws IOException {
        File lotteryFile = new File("lotteryFile.txt");
        lotteryFile.createNewFile();
        Toys soldier = new Soldier("Ben", 10);
        Doll doll = new Doll("Ann", 8);
        Car car = new Car("Jeep", 11);
        Bear bear = new Bear("Ted", 9);
        FileOutputStream outputStream = new FileOutputStream(lotteryFile);
        byte[] buffer = soldier.getInfo().getBytes();
        byte[] buffer1 = bear.getInfo().getBytes();
        byte[] buffer2 = car.getInfo().getBytes();
        byte[] buffer3 = doll.getInfo().getBytes();
        outputStream.write(buffer);
        outputStream.write(buffer1);
        outputStream.write(buffer2);
        outputStream.write(buffer3);
        outputStream.close();


        ArrayList<Toys> lottery = new ArrayList<>();
        int lotteryCount = 4;
        System.out.println("Начальный состав игрушек: ");
        for (int i = 0; i < lotteryCount; i++) {
            lottery.add(soldier);
            lottery.add(doll);
            lottery.add(bear);
            lottery.add(car);
            System.out.println(lottery.get(i).getInfo());
        }
        Random rand = new Random();
        int coefficientWin = rand.nextInt(5);
        int value = 5;
        System.out.println("Выигрышный коэффициент: " + coefficientWin);
        if (5 == value * coefficientWin) {
            System.out.println("Выиграли солдатика!");
            System.out.println("Осталось солдатиков: " + (soldier.count - 1));
        }
        if (10 == value * coefficientWin) {
            System.out.println("Выиграли медведя!");
            System.out.println("Осталось медведей: " + (bear.count - 1));
        }
        if (15 == value * coefficientWin) {
            System.out.println("Выиграли машинку!");
            System.out.println("Осталось машинок: " + (car.count - 1));
        }
        if (20 == value * coefficientWin) {
            System.out.println("Выиграли куклу!");
            System.out.println("Осталось кукл: " + (doll.count - 1));
        }
        if (0 == value * coefficientWin) {
            System.out.println("Проигрыш");
        }
    }
}


