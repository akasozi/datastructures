package io.datastructures.eric.twopointers;

import java.util.HashMap;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class TwoPointersSorted {
    public static void main(String[] args) {
       int[] numbers = {2,7,11,15};
       int target = 9;
       int[] res = findSumTwoPointer(numbers, target);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }

    // Soln1: Auxiliary Datastruc
    public static int[] findSumHashMap(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement) + 1, i + 1};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
    // soln2: Two pointer technique
    // [2,7,11,15] target = 9
    public static int[] findSumTwoPointer(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if ((nums[i] + nums[j]) == target) {
                return new int[] {i + 1, j + 1};
            } else if ((nums[i] + nums[j]) > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[] {};
    }

}
