package com.niroshan.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashSetMain {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Set<String> words = new HashSet<>();
        long totalTime = 0;


        while (scanner.hasNext()){
            String word = scanner.next();
            if(word.equals("exit"))break;


            long calTime = System.currentTimeMillis();
            words.add(word);
            calTime = System.currentTimeMillis() - calTime;
            totalTime += calTime;

        }

        Iterator<String> wordIte = words.iterator();

        System.out.println("===================\n");
        while (wordIte.hasNext()){
            System.out.println(wordIte.next());
        }
        System.out.println(totalTime);


    }
}
