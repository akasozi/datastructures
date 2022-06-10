package io.datastructures.mentalmodels.slidingwindow;

import java.util.HashMap;

/**
 * Find the length of the longest substring with k distinct characters!
 * Input s = "eceba", k = 2
 * Output 3
 */
public class LengthOfLongestSubstringKDistinct {

    public static void main(String[] args) {
       String s = "eceba";
       int k = 2;

        System.out.println("ans: " + lengthLongestSubstringKDistinct(s, k));
    }

    public static int lengthLongestSubstringKDistinct(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = Integer.MIN_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char cur = s.charAt(right);
            map.put(cur, map.getOrDefault(cur, 0) + 1);

            while (map.size() > k) {
                char startChar = s.charAt(left);
                map.put(startChar, map.get(startChar) - 1);
                if (map.get(startChar) == 0) {
                    map.remove(startChar);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }


}
