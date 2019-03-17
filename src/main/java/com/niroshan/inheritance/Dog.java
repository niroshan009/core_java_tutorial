package com.niroshan.inheritance;

public class Dog  extends  Animal{

    private int legCount;

    public Dog(String animalType, int legCount) {
        super(animalType);
        this.legCount = legCount;
    }

    public void move(){
        System.out.println("Dog"+super.animalType+"is runing");
    }




}
