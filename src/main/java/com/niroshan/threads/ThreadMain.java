package com.niroshan.threads;

import javax.print.attribute.standard.MediaSize;

public class ThreadMain {

    public static final int NACCOUNTS = 100;
    public static final double INITIAL_AMOUNT = 1000;

    public static void main(String[] args){
        Bank b = new Bank(NACCOUNTS, INITIAL_AMOUNT);
        int i;
        for(i =0; i < NACCOUNTS; i++){
            TransferRunnable tf = new TransferRunnable(b,i,INITIAL_AMOUNT);
            Thread t = new Thread(tf);
            t.start();
        }
    }
}
