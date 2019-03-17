package com.niroshan.inheritance;

public class Animal {
    public String animalType;

    public Animal(String animalType){
        this.animalType = animalType;
    }

    public void move(){
        System.out.println("Animal: "+animalType+"is moving");
    }
}
