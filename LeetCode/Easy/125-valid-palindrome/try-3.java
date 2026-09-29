/*
 * Problem #125: Valid Palindrome
 * Difficulty: Easy
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 01/03/2026, 14:40:56
 * Link: https://leetcode.com/problems/valid-palindrome/
 */

class Solution {
    public boolean isPalindrome(String s) {

        // Step 1: Remove non-alphanumeric characters
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Convert to char array
        char[] arr = s.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        // Step 3: Two pointer check
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
