package com.company.algorithms.search.binarysearch;

public class BinarySearchTester {

    public static void main(String[] args) {
        BinarySearchTester binarySearchTester = new BinarySearchTester();
        int[] nums = {2, 7, 9, 10, 11};
        int target = 9;
        int index = binarySearchTester.binarySearch(nums, target);
        System.out.println(index);
    }

    public int binarySearch(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {
            int low = 0;
            int high = nums.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }


}
