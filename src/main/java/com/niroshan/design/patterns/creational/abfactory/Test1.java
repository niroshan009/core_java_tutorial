package com.niroshan.design.patterns.creational.abfactory;

public class Test1 {
    public static void main(String[] args) {

        AccountFactory accountFactory = new HNBAccountFactory();
        Account kidsAccount = accountFactory.getKidAccount();
        Account adultAccount = accountFactory.getAdultAccount();
        kidsAccount.withdrawMoney();
        adultAccount.withdrawMoney();

        accountFactory = new DBSAccountFactory();
        kidsAccount = accountFactory.getKidAccount();
        adultAccount = accountFactory.getAdultAccount();
        kidsAccount.withdrawMoney();
        adultAccount.withdrawMoney();
    }
}



