/*
 * Problem #189: Rotate Array
 * Difficulty: Medium
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 24/03/2026, 16:28:18
 * Link: https://leetcode.com/problems/rotate-array/
 */

class Solution {
    // reverse function
    public void reverse(int nums[], int l, int r) {
        while (l <= r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length; //6
        // right shift by k in O(n) tc and using no extra space

        // edge case
        k = k % n;

        if (n == 0) {
            return;
        }

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        // reverse(nums, 0, n);
    }
}
