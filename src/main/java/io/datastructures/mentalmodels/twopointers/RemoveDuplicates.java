package io.datastructures.mentalmodels.twopointers;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
       int[] nums = {1, 1, 2}; // {1, 2}
        System.out.println("ans: " + removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

          // int length = 0;
          int j = 0;
          for (int i = 0; i < nums.length - 1; i++) {
              if (nums[i] != nums[i + 1]) {
                  nums[j++] = nums[i];
              }
          }
          nums[j++] = nums[nums.length - 1];
          return j;
    }
}
