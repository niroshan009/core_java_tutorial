package com.niroshan.design.patterns.creational.abfactory;

public class KidsAccount implements Account {
    String bankName;
    public KidsAccount(String bankName)
    {
        this.bankName = bankName;
    }
    @Override
    public void withdrawMoney() {
        System.out.println("withddrawing from kids account in "+bankName);

    }
}
