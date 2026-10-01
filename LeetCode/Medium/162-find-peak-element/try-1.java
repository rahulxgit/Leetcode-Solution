/*
 * Problem #162: Find Peak Element
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 01/04/2026, 15:55:50
 * Link: https://leetcode.com/problems/find-peak-element/
 */

class Solution {
    public int findPeakElement(int[] nums) {
        // brute force apprach
        int n = nums.length;

        if(n <= 1){
            return 0;
        }
        // edge case for nums[0]

        if(nums[0] > nums[1]){
            return 0;
        }
        // edge case for nums[n-1]
        if(nums[n - 1] > nums[n - 2]){
            return n - 1;
        }

        for(int i = 1; i < n - 1; i++){
            if(nums[i] > nums[i + 1] && nums[i] > nums[i - 1]){
                return i;
            }
        }
        // if no peak element return -1
        return -1;
    }
}
