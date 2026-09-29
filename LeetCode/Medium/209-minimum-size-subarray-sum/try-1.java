/*
 * Problem #209: Minimum Size Subarray Sum
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 22/09/2026, 11:40:24
 * Link: https://leetcode.com/problems/minimum-size-subarray-sum/
 */

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        int minL = Integer.MAX_VALUE;

        int sum = 0;
        while (j < n) {
            sum += nums[j];
            while (sum >= target) {
                minL = Math.min(minL, j - i + 1);

                sum -= nums[i];
                i++;

            }
            j++;
        }
        return minL ==  Integer.MAX_VALUE ? 0 : minL;
    }
}
