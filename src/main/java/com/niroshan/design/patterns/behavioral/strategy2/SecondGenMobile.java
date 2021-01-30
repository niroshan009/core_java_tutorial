package com.niroshan.design.patterns.behavioral.strategy2;

public class SecondGenMobile extends MobilePhone {
    public SecondGenMobile() {
        super(new GPRSConnection());
    }
}
