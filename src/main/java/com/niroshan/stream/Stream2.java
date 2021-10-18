package com.niroshan.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
        Integer[] myNums = {1,2,3};

        Stream<Integer> myStream = Arrays.stream(myNums);

        myStream
                .filter((k) -> k/2 == 0)
                .map((i) -> i * 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        fizzBuzz(15);
    }

    public static void fizzBuzz(int n) {
        // Write your code here

        for(int i = 1; i <= n ; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0 ) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public interface Animal {

    }
}
