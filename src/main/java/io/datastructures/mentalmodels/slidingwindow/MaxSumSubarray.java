package io.datastructures.mentalmodels.slidingwindow;

/**
 *
 * Find the max sum subarray of a fixed size k
 *
 * Example input: [4,2,1,7,8,1,2,8,1,0]
 *
 */
public class MaxSumSubarray {

    public static void main(String[] args) {
        int[] nums = {4,2,1,7,8,1,2,8,1,0};
        int k = 3;
        System.out.println("ans: " + findMaxSumSubarray(nums, 3));
    }

    public static int findMaxSumSubarray(int[] nums, int k) {
        int maxValue = Integer.MIN_VALUE;
        int currentRunningSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentRunningSum += nums[i];
            if (i >= k-1) {
                maxValue = Math.max(currentRunningSum, maxValue);
                currentRunningSum -= nums[i - (k-1)];
            }
        }
        return maxValue;
    }
}
