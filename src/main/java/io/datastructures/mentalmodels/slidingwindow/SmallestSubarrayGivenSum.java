package io.datastructures.mentalmodels.slidingwindow;

/**
 *
 * Given an array of positive integers, Find the size of the smallest subarray whose sum greater than or equal to 8
 * sliding window will work iff all the elements are positive!
 */
public class SmallestSubarrayGivenSum {

    public static void main(String[] args) {
       int[] nums = {4,2,2,7,8,1,2,8,10};
       int targetSum = 8;
       System.out.println("ans: " + smallestSubArraySum(nums, targetSum));
    }

    public static int smallestSubArraySum(int[] nums, int targetSum) {

        int windowStart = 0;
        int currentSum = 0;
        int minWindowSize = Integer.MAX_VALUE;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
           currentSum += nums[windowEnd];

           while (currentSum >= targetSum) {
             minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1);
             currentSum -= nums[windowStart];
             windowStart++;
           }
        }
        return minWindowSize;
    }




}
