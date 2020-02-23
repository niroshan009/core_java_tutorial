package com.niroshan.design.patterns.structural.abfactory;

public class AdultAccount implements Account {

    String bankName;
    public AdultAccount(String bankName){
        this.bankName = bankName;
    }
    @Override
    public void withdrawMoney() {
        System.out.println("withdrawing from adult account in "+ bankName );

    }
}
