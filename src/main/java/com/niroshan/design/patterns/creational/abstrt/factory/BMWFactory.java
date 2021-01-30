package com.niroshan.design.patterns.creational.abstrt.factory;

public class BMWFactory implements VehicleFactory {
    private String brand = "BMW";

    @Override
    public Vehicle makeCar() {
        return new Car(brand);
    }

    @Override
    public Vehicle makeSUV() {
        return new SUV(brand);
    }

    @Override
    public Vehicle makeTruck() {
        return new Truck(brand);
    }
}
