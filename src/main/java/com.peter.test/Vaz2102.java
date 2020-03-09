package com.peter.test;

public class Vaz2102 extends Car {

    private int doors;
    private int horsePower;

    public Vaz2102(int doors, int horsePower) {
        this.doors = doors;
        this.horsePower = horsePower;
    }

    int doors() {
        return doors;
    }

    int horsePower() {
        return horsePower;
    }
}
