/*
 * Problem #33: Search in Rotated Sorted Array
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 25/03/2026, 14:34:30
 * Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
 */

class Solution {

    public int binarySearch(int nums[], int target, int l, int r) {
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;   // ✅ correct
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    // find pivot (index of smallest element)
    public int pivot(int nums[]) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] > nums[r]) {
                l = mid + 1;   // pivot in right
            } else {
                r = mid;       // pivot in left (including mid)
            }
        }
        return l;
    }

    public int search(int[] nums, int target) {
        int pivot_idx = pivot(nums);

        // search in left half
        int left = binarySearch(nums, target, 0, pivot_idx - 1);
        if (left != -1) return left;

        // search in right half
        return binarySearch(nums, target, pivot_idx, nums.length - 1);
    }
}
