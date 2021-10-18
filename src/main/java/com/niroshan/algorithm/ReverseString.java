package com.niroshan.algorithm;

public class ReverseString {

    public static void main(String[] args) {
        char[] letter = {'a','b','c','d'};
        reverseString(letter);
        for (int i = 0; i < letter.length; i++) {
            System.out.println(letter[i]);
        }
    }


    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length -1;
        while (start < end) {
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
    }
}
