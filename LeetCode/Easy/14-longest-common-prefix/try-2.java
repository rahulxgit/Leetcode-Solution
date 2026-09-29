/*
 * Problem #14: Longest Common Prefix
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 02/04/2026, 18:29:15
 * Link: https://leetcode.com/problems/longest-common-prefix/
 */

class Solution {
    public static String common(String s1, String s2) {
        int n = Math.min(s1.length(), s2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                sb.append(s1.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String prefix = strs[0];
        for (int i = 1; i < n; i++) {
            prefix = common(prefix, strs[i]);
            // if (prefix.equals("")) break;      // optimization
        }
        return prefix;
    }
}
