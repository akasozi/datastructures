package io.datastructures.mentalmodels.twopointers;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of numbers already sorted in ascending order, find two numbers such that they add up to a specific
 * target sum. [2, 7, 11, 15] target = 9
 */
public class TwoSum {

    public static void main(String[] args) {
        //
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // System.out.println("ans: " + Arrays.toString(twoSum(nums, target)));
        System.out.println("ans: " + Arrays.toString(twoSumModified(nums, target)));
    }

    // Traditional TWO SUM!
    //  1. input is sorted
    // 2. ans[0] < ans[1]
    // 3. You cannot use the same element twice!
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                res[0] = map.get(complement);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }

    public static int[] twoSumModified(int[] nums, int target) {

        int i = 0, j = nums.length - 1;
        int[] ans = new int[2];

        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                ans[0] = i;
                ans[1] = j;
                return ans;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }

        }
        return ans;
    }
}
