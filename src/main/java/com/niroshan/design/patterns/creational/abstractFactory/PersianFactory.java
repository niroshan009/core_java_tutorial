package com.niroshan.design.patterns.creational.abstractFactory;

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
