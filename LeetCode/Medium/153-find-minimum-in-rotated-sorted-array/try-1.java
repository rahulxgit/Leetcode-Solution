/*
 * Problem #153: Find Minimum in Rotated Sorted Array
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 25/03/2026, 14:13:04
 * Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */

class Solution {
    public int pivot(int nums[]){
        int l = 0;
        int r = nums.length - 1;

        while(l < r){
            int mid = l + (r - l)/2;

            if(nums[mid] > nums[r]){
                l = mid + 1;   // ✅ move right
            } else {
                r = mid;       // ✅ keep mid
            }
        }
        return nums[l];   // minimum element
    }

    public int findMin(int[] nums) {
        return pivot(nums);
    }
}
