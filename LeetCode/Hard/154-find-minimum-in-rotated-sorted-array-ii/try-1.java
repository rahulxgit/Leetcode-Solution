/*
 * Problem #154: Find Minimum in Rotated Sorted Array II
 * Difficulty: Hard
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 25/03/2026, 14:12:53
 * Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
 */

class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while(l < r){
            int mid = l + (r - l)/2;

            if(nums[mid] > nums[r]){
                l = mid + 1;
            } 
            else if(nums[mid] < nums[r]){
                r = mid;
            } 
            else {
                r--;   
            }
        }
        return nums[l];
    }
}
