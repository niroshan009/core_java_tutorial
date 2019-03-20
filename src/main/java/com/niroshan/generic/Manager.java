package com.niroshan.generic;

public class Manager extends Employee {

    private double bonus;

    public Manager(){}

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name){
        super(name);
    }
    public Manager(String name, double bonus) {
        super(name);
        this.bonus = bonus;
    }
}
