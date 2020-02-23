package com.niroshan.design.patterns.structural.abstractFactory;

public class AbstractFactoryMain {

    public static void main(String[] args){
        AbstractFactory germanFactory = new FactoryMaker().getFactory("german");
        Cat c = germanFactory.createCat();
        c.meow();

        Dog d = germanFactory.createDog();
        d.bark();

        System.out.println("================");

        AbstractFactory persianFactory = new FactoryMaker().getFactory("persian");
        Cat c1 = persianFactory.createCat();
        c1.meow();

        Dog d1 = persianFactory.createDog();
        d1.bark();




    }


public static class FactoryMaker{

    public static AbstractFactory getFactory(String type){

        if(type.equals("german")){
            return new GermanFactory();
        }else if(type.equals("persian")){
            return new PersianFactory();
        }
        else{
            return null;
        }
    }

}

}