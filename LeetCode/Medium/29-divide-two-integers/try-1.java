/*
 * Problem #29: Divide Two Integers
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 17/05/2026, 22:41:46
 * Link: https://leetcode.com/problems/divide-two-integers/
 */

class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        return dividend / divisor;
    }
}
