package com.niroshan.design.patterns.structural.decorator;

public abstract class MotherboradDecorator implements  Computer{
    private Computer computer;

    public MotherboradDecorator(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void turnOn() {
        computer.turnOn();
    }
}
