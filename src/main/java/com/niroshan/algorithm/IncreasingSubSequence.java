package com.niroshan.algorithm;

import java.util.Arrays;
import java.util.Collections;

public class IncreasingSubSequence {
    public static void main(String[] args) {
        int[] input = {4, 10, 4, 3, 8, 9};

        int answer = increasingSubsequence(input);
        System.out.println(answer);
    }

    public static int increasingSubsequence(int[] nums) {

        Integer[] subSequentArr = new Integer[nums.length];
        Arrays.fill(subSequentArr, 1);

        for (int leadingIndex = nums.length - 1; leadingIndex >= 0; leadingIndex--) {
            for (int tailingIndex = leadingIndex + 1; tailingIndex < nums.length; tailingIndex++) {
                {
                    if (nums[leadingIndex] < nums[tailingIndex]) {
                        subSequentArr[leadingIndex] = Math.max(subSequentArr[leadingIndex], 1 + subSequentArr[tailingIndex]);
                    }
                }
            }
        }
        return Collections.max(Arrays.asList(subSequentArr));
    }
}
