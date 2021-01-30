package com.niroshan.design.patterns.behavioral.strategy;

public interface PayStratergy {

    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
