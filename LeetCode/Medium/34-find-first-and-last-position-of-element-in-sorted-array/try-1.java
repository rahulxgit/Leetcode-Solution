/*
 * Problem #34: Find First and Last Position of Element in Sorted Array
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 23/03/2026, 15:46:50
 * Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */

class Solution {
    // find left_most
    public int left_most(int nums[], int target){
        int l = 0;
        int r = nums.length - 1;
        int left_most = -1;

        while(l <= r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                left_most = mid;
                r = mid -1;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return left_most;
    }
    // find right_most
    public int right_most(int nums[], int target){
        int l = 0;
        int r = nums.length - 1;
        int right_most = -1;

        while(l <= r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                right_most = mid;
                l = mid + 1;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return right_most;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = left_most(nums, target);
        int last = right_most(nums, target);

        int arr[] = {first, last};
        return arr;
    }
}
