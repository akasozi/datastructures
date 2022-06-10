package io.datastructures.mentalmodels.twopointers;

/**
 * You are given an integer array height of length n. there are n vertical lines drawn such that
 *  the two endpoints
 *  Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 */
public class MaxArea {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println("Ans: " + maxArea(height));
    }

    public static int maxArea(int[] nums) {
         int left = 0, right = nums.length - 1, maxArea = Integer.MIN_VALUE;

         while (left < right) {
             int area = (right - left) * Math.min(nums[left], nums[right]);
             maxArea = Math.max(maxArea, area);
             if (nums[left] < nums[right]) {
                 left++;
             } else {
                 right--;
             }
         }
         return maxArea;
    }
}
