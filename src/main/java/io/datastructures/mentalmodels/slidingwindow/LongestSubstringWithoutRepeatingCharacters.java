package io.datastructures.mentalmodels.slidingwindow;

import java.util.HashSet;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3
 * Edge cases:
 * 1. Empty string
 * 2. String with only one element
 * 3. String with all characters repeated
 * 4. All characters are unique
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
       String s = "abcabcbb";
        System.out.println("ans: " + longestSubstring(s));
    }

    public static int longestSubstring(String s) {

        int left = 0, right = 0, max = Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();

        for (right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
