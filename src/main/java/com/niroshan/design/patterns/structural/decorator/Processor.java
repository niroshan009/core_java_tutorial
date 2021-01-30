package com.niroshan.design.patterns.structural.decorator;

public class Processor extends MotherboradDecorator {
    int speed;
    public Processor(Computer computer) {
        super(computer);
    }

    public Processor(Computer computer, int speed) {
        super(computer);
        this.speed = speed;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(" turning on the processor with the speed: "+this.speed);
    }
}
