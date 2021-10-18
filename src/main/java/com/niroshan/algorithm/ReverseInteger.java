package com.niroshan.algorithm;

public class ReverseInteger {

    public static void main(String[] args) {
        int n;
        n = 1534236469;

        System.out.println(reverse(n));
    }

    public static int reverse(int x) {

        char[] d;
        String s = ""+x;
        if(x >= 0) {
            d = new char[s.length()];
            d = s.toString().toCharArray();
        } else {
            d = new char[s.length()-1];
            d = s.substring(1,s.length()).toString().toCharArray();
        }
        int start = 0;
        int end = d.length-1;
        while (start < end) {
            char temp = d[start];
            d[start] = d[end];
            d[end] = temp;
            start++;
            end--;
        }

        String ans = new String(d);

        long answer = Long.parseLong(ans);
        if(answer > Integer.MAX_VALUE) {
            return 0;
        }
        if(x < 0) {
            answer = answer *-1;
        }
        return (int)answer;
    }
}
