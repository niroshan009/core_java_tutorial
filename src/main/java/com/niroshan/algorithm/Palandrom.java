package com.niroshan.algorithm;

public class Palandrom {
    public static void main(String[] args) {

        String word = "ababak";

        System.out.println(isPalandrom(word));
    }

    public static boolean isPalandrom(String word) {
        boolean isPalandrom = true;

        char[] wrdCharArr = word.toCharArray();
        int end = wrdCharArr.length-1;
        for(int i = 0 ; i < wrdCharArr.length/2 ; i++ ) {
            if(wrdCharArr[i] != wrdCharArr[end]){
                isPalandrom = false;
            }
            end--;
        }
        return isPalandrom;
    }
}
