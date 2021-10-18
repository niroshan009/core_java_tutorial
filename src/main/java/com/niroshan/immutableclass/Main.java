package com.niroshan.immutableclass;

public class Main {

    public static void main(String[] args) {
        String name = "hello";
        String newName = name.replace("llo","world");

        System.out.println(name);
        System.out.println(newName);

        Person p1 = new Person("thusitha", 30);
        updatePerson(p1.getAge(), p1.getName());
        System.out.println(p1.getName()+" : "+ p1.getAge());

        PersonMutable p2 = new PersonMutable("tnk", 40);
        updatePerson(p2.getAge(), p2.getName());
        System.out.println(p2.getName()+" : "+p2.getAge());


    }

    public static void updatePerson(int age, String name){
        age = 10;
        name = "xyz";
    }
}
