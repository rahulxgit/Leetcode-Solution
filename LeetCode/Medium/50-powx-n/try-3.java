/*
 * Problem #50: Pow(x, n)
 * Difficulty: Medium
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 17/04/2026, 16:29:09
 * Link: https://leetcode.com/problems/powx-n/
 */

class Solution {
    public double myPow(double x, int n) {
        // By Recursion
        // Handle edge case of Integer.MIN_VALUE
        if (n == Integer.MIN_VALUE) {
            return myPow(1 / x, -(n + 1)) / x;
        }
        // Handle negative power
        if (n < 0) {
            return myPow(1 / x, -n);
        }

        // Base case
        if (n == 0)
            return 1;

        double half = myPow(x, n / 2);

        double result = half * half;

        if (n % 2 == 1) { // if odd
            result = (result * x);
        }
        return result;
    }
}
