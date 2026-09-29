/*
 * Problem #3097: Shortest Subarray With OR at Least K II
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 27/05/2026, 13:22:10
 * Link: https://leetcode.com/problems/shortest-subarray-with-or-at-least-k-ii/
 */

class Solution {

    public void addInWindow(int number, int arr[]) {
        for (int i = 0; i < 32; i++) {
            if (((number >> i) & 1) == 1) {
                arr[i]++;
            }
        }
    }

    public void removeFromWindow(int number, int arr[]) {
        for (int i = 0; i < 32; i++) {
            if (((number >> i) & 1) == 1) {
                arr[i]--;
            }
        }
    }

    public int getDecimalNo(int arr[]) {
        int num = 0;

        for (int i = 0; i < 32; i++) {
            if (arr[i] > 0) {
                num |= (1 << i);
            }
        }

        return num;
    }

    public int minimumSubarrayLength(int[] nums, int k) {

        int n = nums.length;
        int len = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        int arr[] = new int[32];

        while (j < n) {

            addInWindow(nums[j], arr);

            while (i <= j && getDecimalNo(arr) >= k) {

                len = Math.min(len, j - i + 1);

                removeFromWindow(nums[i], arr);

                i++;
            }

            j++;
        }

        return len == Integer.MAX_VALUE ? -1 : len;
    }
}
