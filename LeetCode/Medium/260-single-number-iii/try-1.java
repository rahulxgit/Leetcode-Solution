/*
 * Problem #260: Single Number III
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 16/05/2026, 20:53:40
 * Link: https://leetcode.com/problems/single-number-iii/
 */

class Solution {

    public int[] singleNumber(int[] nums) {

        int arr[] = new int[2];

        // XOR of all numbers
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }

        // rightmost set bit
        int mask = ans & (-ans);

        int a = 0, b = 0;

        for (int i = 0; i < nums.length; i++) {

            // divide into two groups
            if ((nums[i] & mask) != 0) {
                a ^= nums[i];
            } else {
                b ^= nums[i];
            }
        }

        arr[0] = a;
        arr[1] = b;

        return arr;
    }
}
