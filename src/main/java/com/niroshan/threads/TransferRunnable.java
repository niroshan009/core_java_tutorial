package com.niroshan.threads;




/*
 * Since the the thread is not synced total amount bank has been changed
 *
 *
 *
 *
 * */
public class TransferRunnable implements Runnable {

    private Bank bank;
    private int from;
    private double maxAmount;
    private int DELAY = 5;

    public TransferRunnable(Bank b,int from,double maxAmount){
        this.bank = b;
        this.from = from;
        this.maxAmount = maxAmount;
    }


    @Override
    public void run() {

        try {

            while (true){
                int toAccount = (int) (bank.size()*Math.random());
                double amount =maxAmount * Math.random();

                // below is the call from regular method which has lock implementation
                // bank.transfar(from,toAccount,amount);

                //below is the method with the synchronized method
                bank.transferSynchronized(from,toAccount,amount);
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException e){

        }

    }
}
