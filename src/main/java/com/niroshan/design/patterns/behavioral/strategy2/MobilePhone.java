package com.niroshan.design.patterns.behavioral.strategy2;

public abstract class MobilePhone {
    private IConnectBehavior iConnectBehavior;

    public MobilePhone(IConnectBehavior iConnectBehavior) {
        this.iConnectBehavior = iConnectBehavior;
    }

    public void connectToInterenet() {
        iConnectBehavior.connectToInternet();
    }

    public void setiConnectBehavior(IConnectBehavior iConnectBehavior) {
        this.iConnectBehavior = iConnectBehavior;
    }
}
