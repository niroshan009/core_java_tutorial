package com.niroshan.design.patterns.behavioral.strategy2;

public class FourGConnection implements IConnectBehavior {
    @Override
    public void connectToInternet() {
        System.out.println("connecting to the internet via 4G");
    }
}
