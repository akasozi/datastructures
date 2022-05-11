package io.datastructures.mentalmodels.twopointers;

import java.util.Arrays;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class SortedSquares {

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println("ans: " + Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1, n = nums.length, index = n - 1;
        int[] res = new int[n];

        while (index >= 0) {
            int leftNum = nums[left] * nums[left];
            int rightNum = nums[right] * nums[right];

            if (leftNum < rightNum) {
                res[index--] = rightNum;
                right--;
            } else {
                res[index--] = leftNum;
                left++;
            }
        }

        return res;
    }
}
