package com.niroshan.design.patterns.creational.abfactory;

class DBSAccountFactory implements AccountFactory{

    @Override
    public Account getKidAccount() {
        return new KidsAccount("DBS");
    }

    @Override
    public Account getAdultAccount() {
        return new AdultAccount("DBS");
    }
}