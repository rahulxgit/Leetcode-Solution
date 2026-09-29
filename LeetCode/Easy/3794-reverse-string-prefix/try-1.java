/*
 * Problem #3794: Reverse String Prefix
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 03/01/2026, 20:05:48
 * Link: https://leetcode.com/problems/reverse-string-prefix/
 */

class Solution {
    public String reversePrefix(String s, int k) {
       String prefix = s.substring(0,k);
        String revPrefix = new StringBuilder(prefix).reverse().toString();
        return revPrefix + s.substring(k);
    }
}
