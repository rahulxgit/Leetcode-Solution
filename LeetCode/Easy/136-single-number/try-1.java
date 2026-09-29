/*
 * Problem #136: Single Number
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 16/05/2026, 16:35:18
 * Link: https://leetcode.com/problems/single-number/
 */

class Solution {
    public int singleNumber(int[] nums) {
        int ans  = 0;
        for(int i = 0; i < nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }
}
