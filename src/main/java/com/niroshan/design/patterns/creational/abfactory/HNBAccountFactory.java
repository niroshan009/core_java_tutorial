package com.niroshan.design.patterns.creational.abfactory;

public class HNBAccountFactory implements AccountFactory{

    @Override
    public Account getKidAccount() {
        return new KidsAccount("HNB");
    }

    @Override
    public Account getAdultAccount() {
        return new AdultAccount("HNB");
    }
}