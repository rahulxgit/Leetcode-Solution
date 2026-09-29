/*
 * Problem #3880: Minimum Absolute Difference Between Two Values
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 28/03/2026, 20:19:26
 * Link: https://leetcode.com/problems/minimum-absolute-difference-between-two-values/
 */

class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n = nums.length;
        int lastOne = -1;
        int lastTwo = -1;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                lastOne = i;
                if (lastTwo != -1) {
                    diff = Math.min(diff, i - lastTwo);
                }
            }
            if (nums[i] == 2) {
                lastTwo = i;
                if (lastOne != -1) {
                    diff = Math.min(diff, i - lastOne);
                }
            }

        }
        return (diff == Integer.MAX_VALUE) ? -1 : diff;
    }
}
