/*
 * Problem #1283: Find the Smallest Divisor Given a Threshold
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 28/03/2026, 19:34:04
 * Link: https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
 */

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = 0;

        for (int num : nums) {
            r = Math.max(r, num);
        }

        while (l < r) {
            int mid = l + (r - l) / 2;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += Math.ceil((double) nums[i] / mid);
            }
            if (sum <= threshold) {
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}
