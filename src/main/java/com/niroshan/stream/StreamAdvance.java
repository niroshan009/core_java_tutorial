package com.niroshan.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAdvance {


    public static void main(String[] args) {

        Person p1 = new StreamAdvance().new Person(18, "Max");
        Person p2 = new StreamAdvance().new Person(23, "Peter");
        Person p3 = new StreamAdvance().new Person(23, "Pamela");
        Person p4 = new StreamAdvance().new Person(12, "David");

        List<Person> persons = Arrays.asList(p1,p2,p3,p4);

        List<Person> filtered = persons.stream()
                .filter(p -> p.name.startsWith("P"))
                .collect(Collectors.toList());

        System.out.println(filtered);

        Map<Integer, List<Person>> personsByAge = persons
                .stream()
                .collect(Collectors.groupingBy(p -> p.age));

        personsByAge
                .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

        Double averageAge = persons
                .stream()
                .collect(Collectors.averagingInt(p -> p.age));

        System.out.println(averageAge);     // 19.0

    }


    class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

}
