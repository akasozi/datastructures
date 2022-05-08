package io.datastructures.mentalmodels.slidingwindow;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class GetSubArrays {

    public static void main(String[] args) {
        int[] nums = {1, 7, 9, 4, 3, 2, 2};
        int desiredSum = 7;
        // [[7], [4,3], [3,2,2]]
        System.out.println(getSubArrays(nums, desiredSum));

    }

    public static List<List<Integer>> getSubArrays(int[] nums, int desiredSum) {
       int left = 0;
       int runninSum = 0;
       List<List<Integer>> result = new ArrayList<>();

       for (int right = 0; right < nums.length; right++) {
           runninSum += nums[right];

           while (runninSum > desiredSum) {
               runninSum -= nums[left];
               left++;
           }

           if (runninSum == desiredSum) {
               int i = left;
               List<Integer> list = new ArrayList<>();
               while (i <= right) {
                   list.add(nums[i]);
                   i++;
               }
               result.add(list);
           }
       }
       return result;
    }
}
