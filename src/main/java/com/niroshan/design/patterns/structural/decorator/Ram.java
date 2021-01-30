package com.niroshan.design.patterns.structural.decorator;

public  class Ram  extends  MotherboradDecorator{

    int size;
    public Ram(Computer computer) {
        super(computer);
    }
    public Ram(Computer computer, int size){
     super(computer);
     this.size = size;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(" turning on ram with size: "+ size);
    }
}
