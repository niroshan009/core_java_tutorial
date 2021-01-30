package com.niroshan.design.patterns.behavioral.strategy1;

public abstract class Car {
    private IBreakBehaviour iBreakBehaviour;

    public Car(IBreakBehaviour iBreakBehaviour) {
        this.iBreakBehaviour = iBreakBehaviour;
    }

    public void applyBreak(){
        iBreakBehaviour.applyBreak();
    }

    public void setiBreakBehaviour(IBreakBehaviour iBreakBehaviour) {
        this.iBreakBehaviour = iBreakBehaviour;
    }
}
