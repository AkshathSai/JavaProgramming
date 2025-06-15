package com.example.dev.algorithms.arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OneSum {

    public int oneSum(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break; // Exit the loop once we find the target
            }
        }
        return index; // Return empty if no match found
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 7;
        OneSum oneSum = new OneSum();
        log.info("{}", oneSum.oneSum(nums, target));
    }
}
