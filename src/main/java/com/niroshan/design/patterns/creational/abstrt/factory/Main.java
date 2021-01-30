package com.niroshan.design.patterns.creational.abstrt.factory;

public class Main {
    public static void main(String[] args){
        VehicleFactory factory = new BMWFactory();
        Vehicle car = factory.makeCar();
        Vehicle truck = factory.makeTruck();
        Vehicle SUV = factory.makeSUV();

        car.driverForward();
        car.driveBackward();

        truck.driverForward();
        truck.driveBackward();

        SUV.driverForward();
        SUV.driveBackward();

        factory = new AudiFactory();

        car = factory.makeCar();
        truck = factory.makeTruck();
        SUV = factory.makeSUV();

        car.driverForward();
        car.driveBackward();

        truck.driverForward();
        truck.driveBackward();

        SUV.driverForward();
        SUV.driveBackward();
    }
}
