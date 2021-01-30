package com.niroshan.design.patterns.structural.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Computer computer = new Ram(new Processor(new Motherboard(), 2), 16);
        computer.turnOn();
    }

}
