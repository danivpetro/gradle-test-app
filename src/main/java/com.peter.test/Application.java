package com.peter.test;

import java.util.Scanner;

public class Application {

    private static int read(String message) {
        System.out.println(message);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static void main(String[] args) {
        int bmwHp = read("Enter BMW HP: ");

        Car bmw = new Bmw5(bmwHp);
        Car vaz = new Vaz2102(read("Enter Vaz doors: "), read("Enter Vaz HP: "));

        printInfo(bmw);
        printInfo(vaz);
    }

    private static void printInfo(Car carToPrint) {
        System.out.println(
                " ClassName: " + carToPrint.getClass().getSimpleName() +
                ". Doors: " + carToPrint.doors() +
                ". Horse power: " + carToPrint.horsePower());
    }
}
