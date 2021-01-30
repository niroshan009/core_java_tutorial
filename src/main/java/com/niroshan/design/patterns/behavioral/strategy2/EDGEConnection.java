package com.niroshan.design.patterns.behavioral.strategy2;

public class EDGEConnection implements IConnectBehavior {
    @Override
    public void connectToInternet() {
        System.out.println("Connecting to the interenet via EDGE");
    }
}
