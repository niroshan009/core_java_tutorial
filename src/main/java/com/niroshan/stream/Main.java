package com.niroshan.stream;

import com.sun.tools.javah.Gen;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> peope = getPeople();

        // Filter
        List female = peope.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        female.forEach(System.out::println);
        System.out.println("========");
        // Sort
        List sorted = peope.stream()
                .sorted(Comparator.comparing(Person::getAge)
                .thenComparing(Person::getGender))
                .collect(Collectors.toList());
        sorted.forEach(System.out::println);
        // all match
        System.out.println("=======");
        boolean allMatch = peope.stream()
                .allMatch(person -> person.getAge() > 45);
        System.out.println(allMatch);
        System.out.println("=======");
        // any match
        boolean anyMatch = peope.stream()
                .anyMatch(person -> person.getAge() >= 25);
        System.out.println(anyMatch);
        System.out.println("=======");

        // none match
        boolean nonMatch = peope.stream()
                .noneMatch(person -> person.getName().equals("Ruthe"));
        System.out.println(nonMatch);

        // max
        Optional<Person> maxPerson = peope.stream()
                .max(Comparator.comparing(Person::getAge));
        System.out.println(maxPerson);
        peope.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        System.out.println("=======");

        // min
        Optional<Person> minPerson = peope.stream()
                .min(Comparator.comparing(Person::getAge));
        System.out.println(minPerson);
        peope.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
        System.out.println("=======");

        // group
        Map<Gender,List<Person>> groupByPerson =  peope.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByPerson.forEach((gender, people) -> {
            System.out.println(gender);
            people.forEach(System.out::println);
            System.out.println();
        });
        System.out.println("=======");

        Optional<String> singleWoman = peope.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        singleWoman.ifPresent(System.out::println);
    }

    private static List<Person> getPeople() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("James", 22, Gender.MALE));
        personList.add(new Person("Ruth", 24, Gender.FEMALE));
        personList.add(new Person("Cameron", 26, Gender.FEMALE));
        personList.add(new Person("Cena", 26, Gender.MALE));
        return personList;
    }
}
