package com.niroshan.design.patterns.behavioral.strategy1;

public class SUV extends Car {

    public SUV() {
        super(new ABSBreak());
    }
}
