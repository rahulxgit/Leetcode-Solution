/*
 * Problem #201: Bitwise AND of Numbers Range
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 18/05/2026, 17:51:29
 * Link: https://leetcode.com/problems/bitwise-and-of-numbers-range/
 */

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shiftCount = 0;

        while(left != right){
            // Longest common prefix
            left = (left >> 1);
            right = (right >> 1);
            shiftCount++;
        }
        return (left << shiftCount);
    }
}
