/*
 * Problem #125: Valid Palindrome
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 22/11/2025, 17:26:07
 * Link: https://leetcode.com/problems/valid-palindrome/
 */

class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return false;

        char[] ch = s.toCharArray();
        int l = 0;
        int r = ch.length - 1;

        while (l < r) {

            // move left pointer to next alphanumeric
            if (!Character.isLetterOrDigit(ch[l])) {
                l++;
                continue;
            }

            // move right pointer to previous alphanumeric
            if (!Character.isLetterOrDigit(ch[r])) {
                r--;
                continue;
            }

            // compare lowercase versions
            char leftChar = Character.toLowerCase(ch[l]);
            char rightChar = Character.toLowerCase(ch[r]);

            if (leftChar != rightChar) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}

