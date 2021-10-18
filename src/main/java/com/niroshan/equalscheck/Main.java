package com.niroshan.equalscheck;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Thusitha", 30);
        Person p2 = new Person("Thusitha", 30);

        System.out.println(p1.equals(p2));


        List<Person> personList = new ArrayList<>();

        personList.add(p1);
        System.out.println(personList.contains(p2));


        Set<Person> personSet = new HashSet<>();
        personSet.add(p1);
        personSet.add(p2);
       personSet.forEach(person -> {
           System.out.println(person.toString());
       });
    }

}
