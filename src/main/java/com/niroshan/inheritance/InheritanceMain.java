package com.niroshan.inheritance;

public class InheritanceMain {

    public static void main(String[] args){
        Animal animal = new Animal("Animal");
        animal.move();

        Dog d = new Dog("Dog",4);
        d.move();


        //can cast to parent class type
        Animal dogAnimal = (Animal) d;
        dogAnimal.move();

        /*
        cannot cast to sub/children type from super type
        Dog dog = (Dog) animal;
        dog.move();
        */



        Animal animalD = new Dog("Dog",4);

        Dog dAnimal = (Dog) animalD; //animalD can be casted to Dog type since it was creating dog instence;
        dAnimal.move();
        dAnimal.bark();


    }
}
