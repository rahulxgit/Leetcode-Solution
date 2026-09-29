/*
 * Problem #40: Combination Sum II
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 06/10/2025, 17:27:36
 * Link: https://leetcode.com/problems/combination-sum-ii/
 */

import java.util.*;

class Solution {
    List<List<Integer>> result = new ArrayList<>();

    // TC = O(2^n) | SC = O(n)
    public void solve(int[] candidates, int target, List<Integer> curr, int idx) {
        // Base cases
        if (target < 0)
            return;

        if (target == 0) {
            result.add(new ArrayList<>(curr)); // store copy of current combination
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] == candidates[i - 1]) 
                continue; // skip duplicates

            // Recursion + Backtracking
            curr.add(candidates[i]); // DO
            solve(candidates, target - candidates[i], curr, i + 1); // EXPLORE
            curr.remove(curr.size() - 1); // UNDO
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // Sort to handle duplicates
        solve(candidates, target, new ArrayList<>(), 0);
        return result;
    }
}

