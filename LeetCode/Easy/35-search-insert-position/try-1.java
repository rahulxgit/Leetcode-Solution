/*
 * Problem #35: Search Insert Position
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 21/03/2026, 15:16:57
 * Link: https://leetcode.com/problems/search-insert-position/
 */

class Solution {
    public int searchInsert(int[] nums, int target) {
        // Binary Search syntax - O(logn)
        int left = 0;
        int right = nums.length - 1;
        
        // int mid = left + (right - left)/2;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
                // return mid;
            }else{
                right = mid -1;
                // return mid;
            }
        }
        return left;
    }
}
