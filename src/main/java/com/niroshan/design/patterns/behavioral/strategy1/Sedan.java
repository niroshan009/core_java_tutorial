package com.niroshan.design.patterns.behavioral.strategy1;

public class Sedan extends Car {

    public Sedan() {
        super(new ConventionalBreak());
    }
}
