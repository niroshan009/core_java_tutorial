package com.niroshan.algorithm;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] input = {-1, 0, 1, 2, -1, -4};
        threeSum(input);

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer[]> tempResult = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int first = nums[i];
            for (int j = i + 1; j < nums.length - 1; j++) {
                int second = nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    int third = nums[k];
                    int sum = first + second + third;
                    if (sum == 0) {
//                        if(first != second && second != third) {
                        Integer[] a = {first, second, third};
                        List<Integer> l = new ArrayList<>(Arrays.asList(a));
                        if (!result.contains(l)) {
                            result.add(l);
                        }
                        tempResult.add(a);

//                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return result;
    }
}
