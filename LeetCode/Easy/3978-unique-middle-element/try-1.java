/*
 * Problem #3978: Unique Middle Element
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 04/07/2026, 20:04:19
 * Link: https://leetcode.com/problems/unique-middle-element/
 */

class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = nums[nums.length / 2];
        int c = 0;

        for(int num : nums){
            if(num == mid){
                c++;
                
            }
        }
        return c == 1;
    }
}
