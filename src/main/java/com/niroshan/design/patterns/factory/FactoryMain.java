package com.niroshan.design.patterns.factory;

public class FactoryMain {
    public static void main(String[] args){
        Dog d = DogFactory.getDog(DogType.PITBULL);
        d.bark();
    }
}
