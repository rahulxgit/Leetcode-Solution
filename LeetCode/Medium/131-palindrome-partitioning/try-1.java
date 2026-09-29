/*
 * Problem #131: Palindrome Partitioning
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 09/10/2025, 18:38:32
 * Link: https://leetcode.com/problems/palindrome-partitioning/
 */

import java.util.*;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        backtrack(s, 0, curr, result);
        return result;
    }

    // Backtracking function
    private void backtrack(String s, int idx, List<String> curr, List<List<String>> result) {
        // Base case
        if (idx == s.length()) {
            result.add(new ArrayList<>(curr)); // Add a copy of current list
            return;
        }

        for (int i = idx; i < s.length(); i++) {
            if (isPalindrome(s, idx, i)) {
                // Choose
                curr.add(s.substring(idx, i + 1));

                // Explore
                backtrack(s, i + 1, curr, result);

                // Un-choose (Backtrack)
                curr.remove(curr.size() - 1);
            }
        }
    }

    // Helper function to check palindrome
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}

