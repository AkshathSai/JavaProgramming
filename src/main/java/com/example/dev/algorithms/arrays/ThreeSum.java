package com.example.dev.algorithms.arrays;

import lombok.extern.slf4j.Slf4j;

/**
 * The sorting-based N^2 log N algorithm for 3-SUM
 * is significantly faster in practice than the brute-force N^3 algorithm.
 * <p>
 * N^2 for insertion sort and log N for Binary search = N^2 log N.
 */
@Slf4j
public class ThreeSum {

    // O(N^3) brute-force solution
    public int[] threeSum(int[] nums, int target) {
        int[] indices = new int[3];
        for (int i=0; i< nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                for (int k=j+1; k< nums.length; k++) {
                    if (nums[i] + nums[j] + nums [k] == target) {
                        indices[0] = i;
                        indices[1] = j;
                        indices[2] = k;
                        return indices;
                    }
                }
            }
        }
        return new int[0]; // Return empty if no match found
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,3,7,11,15,8,9,10,12,13,14};
        ThreeSum threeSum = new ThreeSum();
        log.info("{}", threeSum.threeSum(array, 2));
        log.info("{}", threeSum.threeSum(array, 31));
    }
}
