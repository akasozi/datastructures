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
        int i = 0;
        int maxLength = Integer.MIN_VALUE;

        for (int j = 0; j < s.length(); j++) {
            char cur = s.charAt(j);
            map.put(cur, map.getOrDefault(cur, 0) + 1);

            while (map.size() > k) {
                char startChar = s.charAt(i);
                map.put(startChar, map.get(startChar) - 1);
                if (map.get(startChar) == 0) {
                    map.remove(startChar);
                }
                i++;
            }
            maxLength = Math.max(maxLength, j - i + 1);
        }

        return maxLength;
    }


}
