/*
 * Problem #4: Median of Two Sorted Arrays
 * Difficulty: Hard
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 01/04/2026, 13:55:52
 * Link: https://leetcode.com/problems/median-of-two-sorted-arrays/
 */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        // no of element in left side = (n + m + 1)/2;

        int p = m + n;
        int[] arr = new int[p];

        // copy nums1
        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }

        // copy nums2
        for (int i = 0; i < n; i++) {
            arr[m + i] = nums2[i];
        }

        // sort merged array
        Arrays.sort(arr);

        // find median
        if (p % 2 == 1) {
            return arr[p / 2]; // odd
        } else {
            return (arr[p / 2 - 1] + arr[p / 2]) / 2.0; // even
        }

    }
}
