package com.niroshan.design.patterns.behavioral.strategy2;

public class SmartPhone extends MobilePhone {
    public SmartPhone() {
        super(new FourGConnection());
    }
}
