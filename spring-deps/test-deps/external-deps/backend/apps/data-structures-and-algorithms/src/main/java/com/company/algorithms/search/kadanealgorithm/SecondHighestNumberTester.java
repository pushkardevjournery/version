package com.company.algorithms.search.kadanealgorithm;

public class SecondHighestNumberTester {

    public static void main(String[] args) {
        SecondHighestNumberTester tester = new SecondHighestNumberTester();
        int[] nums = {9, 3, 4, 1, 8};
        System.out.println(tester.getSecondHighestNumber(nums));
    }

    private int getSecondHighestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > highest) {
                secondHighest = highest;
                highest = nums[i];
            } else if (nums[i] > secondHighest && nums[i] < highest) {
                secondHighest = nums[i];
            }
        }
        return secondHighest;
    }


}
