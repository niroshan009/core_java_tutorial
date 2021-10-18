package com.niroshan.algorithm;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int ges = removeDuplicates(nums);
        System.out.println(ges);

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else {
            int count = 1;
            int number = nums[0];
            int copy[] = new int[nums.length];
            int anserIndex = 1;
            copy[0] = number;
            for (int i = 0; i < nums.length; i++) {
                if (number != nums[i]) {
                    count++;
                    number = nums[i];
                    copy[anserIndex] = number;
                    anserIndex++;
                }
            }

            for (int i = 0; i < copy.length; i++) {
                nums[i] = copy[i];
            }
            return count;
        }
    }
}
