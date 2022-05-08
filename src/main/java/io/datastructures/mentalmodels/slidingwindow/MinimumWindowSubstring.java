package io.datastructures.mentalmodels.slidingwindow;

import java.util.HashMap;

/**
 *
 */
public class MinimumWindowSubstring {

    public static void main(String[] args) {
        String s1 = "fa4chba4cac";
        String s2 = "abcc";
        System.out.println("ans: " + minimumWindow(s1, s2));
    }

    public static String minimumWindow(String s1, String s2) {

        if (s1 ==null || s2 == null)
            return "";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: s2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = s1.length() -1, min = s1.length();
        int i = 0, j = 0, count = map.size();
        boolean found = true;

        while (j < s1.length()) {
            char endChar = s1.charAt(j++);
            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);
                if (map.get(endChar) == 0)
                    count -= 1;
            }

            if (count > 0) {
                continue;
            }

            while(count == 0) {
                char startChar = s1.charAt(i++);
                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);
                    if (map.get(startChar) > 0)
                        count += 1;
                }
            }

            if (j - i  < min) {
                left = i;
                right = j;
                min = j - i;
                found = true;
            }

        }

        return !found ? "" : s1.substring(left - 1, right);
    }
}
