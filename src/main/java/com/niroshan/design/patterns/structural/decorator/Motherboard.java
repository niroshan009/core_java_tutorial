package com.niroshan.design.patterns.structural.decorator;

public class Motherboard implements Computer {
    @Override
    public void turnOn() {
        System.out.println("turning on the motherboard");
    }
}
