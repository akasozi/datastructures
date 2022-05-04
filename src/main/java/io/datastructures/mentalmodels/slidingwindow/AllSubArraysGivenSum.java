package io.datastructures.mentalmodels.slidingwindow;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers find the subarrays that add up to 9
 * Input: [1,2,3,4,5,6,7,8,9]
 */
public class AllSubArraysGivenSum {


    public static void main(String[] args) {
        System.out.println("ans: " + subArraysGivenSum(new int[] {1,2,3,4,5,6,7,8,9}, 9));
    }

    // Time O(n), Space O(1)
    // Sliding window, dynamic size
    public static List<List<Integer>> subArraysGivenSum(int[] nums, int target) {
         List<List<Integer>> result = new ArrayList<>();
         int currentSum = 0, i = 0;

         for (int j = 0; j < nums.length; j++) {
             currentSum += nums[j];
             while (currentSum >= target) {
                 if (currentSum == target) {
                     List<Integer> buffer = new ArrayList<>();
                     buffer.add(i);
                     buffer.add(j);
                     result.add(buffer);
                 }
                 currentSum -= nums[i++];
             }
         }
        return result;
    }
}
