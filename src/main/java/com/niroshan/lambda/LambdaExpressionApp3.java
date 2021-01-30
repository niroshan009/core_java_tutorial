package com.niroshan.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaExpressionApp3 {


    public static void main(String[] args){
        Dog d1 = new Dog("a", 11);
        Dog d2 = new Dog("a", 14);
        Dog d3 = new Dog("a", 31);
        Dog d4 = new Dog("a", 15);
        Dog d5 = new Dog("a", 51);

        Dog[] drr = {d1,d2,d3,d4,d5};

        Comparator<Dog> com = (Dog dd1, Dog dd2) -> {
            System.out.println("comparing "+dd1.toString()+":"+ dd2.getWeight());
            return dd1.getWeight() - dd2.getWeight();
        };


        Arrays.sort(drr, com);

        System.out.println(Arrays.toString(drr));



    }


}
