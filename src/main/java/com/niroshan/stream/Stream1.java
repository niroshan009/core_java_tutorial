package com.niroshan.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream1 {

    public static void main(String[] args){
        List<String> names = new ArrayList<String>();
        names.add("Ajeet");
        names.add("Negan");
        names.add("Aditya");
        names.add("Steve");



        //Using Stream and Lambda expression
        long count2 = names.stream().filter(str->str.length()<6).count();
        System.out.println("There are "+count2+" strings with length less than 6");


        Stream.iterate(1, count->count+1)
                .filter(number->number%3==0)
                .limit(6)
                .forEach(System.out::println);

    }
}
