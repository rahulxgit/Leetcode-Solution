/*
 * Problem #1855: Maximum Distance Between a Pair of Values
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 19/04/2026, 18:53:43
 * Link: https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/
 */

class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        while (i <= nums1.length - 1 && j <= nums2.length - 1) {
            if (nums1[i] <= nums2[j]) {
                int currMax = j - i;
                // calclaute max
                max = Math.max(currMax, max);
                j++;
            } else {
                i++;
                j++;
            }
        }
        // if(max > 0){
        //     return max;
        // }
        // return 0;
        // Using ternary operator
        return (max > 0) ? max : 0;
    }
}
