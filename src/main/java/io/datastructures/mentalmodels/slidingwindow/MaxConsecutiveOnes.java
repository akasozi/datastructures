package io.datastructures.mentalmodels.slidingwindow;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array if you can flip at most one 0.
 * Input: nums = [1,0,1,1,0]
 * Output: 4
 * Explanation: Flip the first zero will get the maximum number of consecutive 1s. After flipping, the maximum number of consecutive 1s is 4.
 */
public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0};
        System.out.println("ans: " + lengthMaxConsecutiveOnes(nums));

    }

    public static int lengthMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int flipCounter = 0;
        int i = 0, j = 0;
        for (j = 0; j < nums.length; j++) {
            if (nums[j] == 0)
                flipCounter++;
            while (flipCounter > 1) {
                if (nums[i] == 0)
                    flipCounter--;
                i++;
            }
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}
