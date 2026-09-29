/*
 * Problem #1: Two Sum
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 24/05/2026, 18:26:21
 * Link: https://leetcode.com/problems/two-sum/
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
            
            for (int j = i + 1; j < nums.length; j++) {
                
                int sum = nums[i] + nums[j];
                
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}
