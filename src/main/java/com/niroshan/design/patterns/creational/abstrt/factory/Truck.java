package com.niroshan.design.patterns.creational.abstrt.factory;

public class Truck implements Vehicle {
    private String brand;

    public Truck(String brand) {
        this.brand = brand;
    }

    @Override
    public void driverForward() {
        System.out.println(brand+ " truck driving forward");

    }

    @Override
    public void driveBackward() {
        System.out.println(brand+ " truck driving forward");


    }
}
