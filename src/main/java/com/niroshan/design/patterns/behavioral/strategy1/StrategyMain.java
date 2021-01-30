package com.niroshan.design.patterns.behavioral.strategy1;

public class StrategyMain {
    public static void main(String[] args){
        Car SUV = new SUV();
        Car sedan = new Sedan();

        SUV.applyBreak();
        sedan.applyBreak();

        SUV.setiBreakBehaviour(new ConventionalBreak());
        SUV.applyBreak();
    }
}
