/*
 * Problem #3979: Maximum Valid Pair Sum
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 04/07/2026, 20:09:00
 * Link: https://leetcode.com/problems/maximum-valid-pair-sum/
 */

class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;

        int mL = nums[0];
        int ans = Integer.MIN_VALUE;

        for(int j = k; j < n; j++){
            mL = Math.max(mL, nums[j-k]);

            ans = Math.max(ans, mL + nums[j]);
        }
        return ans;
    }
}
