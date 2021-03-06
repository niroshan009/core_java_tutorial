package com.niroshan.design.patterns.creational.abstractFactory;

public  class GermanFactory extends AbstractFactory{


    @Override
    public Dog createDog() {
        return new GermanDog();
    }

    @Override
    public Cat createCat() {
        return new GermanCat();
    }
}
