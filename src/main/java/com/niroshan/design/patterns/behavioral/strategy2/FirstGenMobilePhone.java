package com.niroshan.design.patterns.behavioral.strategy2;

public class FirstGenMobilePhone extends MobilePhone {
    public FirstGenMobilePhone() {
        super(new EDGEConnection());
    }
}
