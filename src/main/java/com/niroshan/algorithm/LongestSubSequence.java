package com.niroshan.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestSubSequence {

    public static void main(String[] args) {
        String t1 = "axbc";
        String t2 = "ab";

        System.out.println(longesetSubsequent(t1,t2));

    }






    public static int longesetSubsequent(String text1, String text2) {
        int answer = 0;

        int col = text2.length();
        int row = text1.length();
        int[][] dp = new int[row+1][col+1];

        for(int i=0;i<=row ; i++) {
            for(int j =0 ;j <= col; j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
                else if(text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[row][col];
    }










}
