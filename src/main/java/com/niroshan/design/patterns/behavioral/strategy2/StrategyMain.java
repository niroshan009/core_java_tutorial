package com.niroshan.design.patterns.behavioral.strategy2;

public class StrategyMain {
    public static void main(String[] args){
        MobilePhone firstGenMobile = new FirstGenMobilePhone();
        MobilePhone secondGenMobile = new SecondGenMobile();
        MobilePhone smartMobil = new SmartPhone();

        firstGenMobile.connectToInterenet();
        secondGenMobile.connectToInterenet();
        smartMobil.connectToInterenet();

        secondGenMobile.setiConnectBehavior(new EDGEConnection());
        secondGenMobile.connectToInterenet();
    }
}
