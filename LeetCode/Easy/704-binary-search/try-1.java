/*
 * Problem #704: Binary Search
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 21/03/2026, 13:40:30
 * Link: https://leetcode.com/problems/binary-search/
 */

class Solution {
    public int search(int[] nums, int target) {
        // Binary Search TC = - O(logn);
        int l = 0;
        int r = nums.length -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return -1;
    }
}
