package com.niroshan.design.patterns.creational.abstrt.factory;

public class Car implements Vehicle{
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public void driverForward() {
        System.out.println(brand+ " Car driving forward");
    }

    @Override
    public void driveBackward() {
        System.out.println(brand+ " Car driving forward");


    }
}
