package com.niroshan.design.patterns.structural.abstractFactory;

public class PersianFactory extends AbstractFactory{
    @Override
    public Dog createDog() {
        return new PersianDog();
    }

    @Override
    public Cat createCat() {
        return new PersianCat();
    }
}
