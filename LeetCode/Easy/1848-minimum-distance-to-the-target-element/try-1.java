/*
 * Problem #1848: Minimum Distance to the Target Element
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 13/04/2026, 14:11:31
 * Link: https://leetcode.com/problems/minimum-distance-to-the-target-element/
 */

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int index = 0;
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] == target){
                index = i;
                int currDiff = Math.abs(index - start);
                diff = Math.min(diff, currDiff);
            }
        }
        return diff;
    }
}
