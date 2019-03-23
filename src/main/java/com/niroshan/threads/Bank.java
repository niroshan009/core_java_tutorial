package com.niroshan.threads;

public class Bank {


    private final double[] accounts;

    public Bank(int n, double initialBalance)
    {
        accounts = new double[n];
        for(int i=0 ; i < n; i++){
            accounts[i] = initialBalance;
        }
    }

    public void transfar(int from, int to,double amount){

        if(accounts[from]< amount) return;
        System.out.println(Thread.currentThread());
        accounts[from] -= amount;
        accounts[to] += amount;
        System.out.println("From: " +from+"\tTo: "+to+"\tAmount: "+amount);
        System.out.println(getTotalBalance());
    }

    public double getTotalBalance(){
        double sum = 0;

        for(double amt : accounts){
            sum+=amt;
        }
        return sum;
    }

    public int size(){
        return accounts.length;
    }
}
