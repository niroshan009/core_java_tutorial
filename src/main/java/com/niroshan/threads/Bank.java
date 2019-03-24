package com.niroshan.threads;

import java.util.Vector;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * ReentrantLock has been introduced to gain a lock before go to the critical section,
 * in here transferring the money
 *
 * Condition is used make the thrad wait if the minimum condition does not meet
 * Once the above condition is fulfilled by another thread that thread calls notifyAll
 * after notifying it waiting threads start to work again from the beginning
 *
 *
 * */

public class Bank {

    private final double[] accounts;
    Lock bankLock;
    Condition suficientFunds;

    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        for (int i = 0; i < n; i++) {
            accounts[i] = initialBalance;
        }

        bankLock = new ReentrantLock();
        suficientFunds = bankLock.newCondition();

    }


    public void transfar(int from, int to, double amount) throws InterruptedException {
        bankLock.lock();
        try {

            if (accounts[from] < amount)
                suficientFunds.await();
            System.out.println(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf("From: " + from + "\tTo: " + to + "\tAmount: " + amount + " total");
            accounts[to] += amount;
            System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
            suficientFunds.signalAll();
        } finally {
            bankLock.unlock();
        }
    }

    public double getTotalBalance() {

        bankLock.lock();
        try {
            double sum = 0;

            for (double amt : accounts) {
                sum += amt;
            }

            return sum;
        } finally {
            bankLock.unlock();
        }

    }


    /*
     *
     * Synchronized code block
     *
     * */

    public synchronized void transferSynchronized(int from, int to, double amount) throws InterruptedException {


        if (accounts[from] < amount)
            wait();
        System.out.println(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf("From: " + from + "\tTo: " + to + "\tAmount: " + amount + " total");
        accounts[to] += amount;
        System.out.printf(" Total Balance: %10.2f%n", getTotalBalanceSynchronized());
        notifyAll();

    }

    public synchronized double getTotalBalanceSynchronized() {
        double sum = 0;

        for (double amt : accounts) {
            sum += amt;
        }
        return sum;
    }

    /*
     *
     * Synchronized code block
     *
     * */

    public synchronized void transferVector(Vector<Double> accounts,int from, int to, double amount) throws InterruptedException {


        synchronized (accounts){
            accounts.set(from,accounts.get(from)-amount);
            accounts.set(to,accounts.get(to)+amount);
        }

    }


    public int size() {
        return accounts.length;
    }
}
