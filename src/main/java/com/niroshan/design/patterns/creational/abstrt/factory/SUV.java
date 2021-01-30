package com.niroshan.design.patterns.creational.abstrt.factory;

public class SUV implements Vehicle {
    private String brand;

    public SUV(String brand) {
        this.brand = brand;
    }

    @Override
    public void driverForward() {
        System.out.println(brand+ " SUV driving forward");
    }

    @Override
    public void driveBackward() {
        System.out.println(brand+ " SUV driving backward");
    }
}
