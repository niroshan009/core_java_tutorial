package com.niroshan.design.patterns.behavioral.strategy2;

public class GPRSConnection implements IConnectBehavior {
    @Override
    public void connectToInternet() {
        System.out.println("Connect to internet using GPRS");
    }
}
