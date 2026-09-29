/*
 * Problem #50: Pow(x, n)
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 25/03/2026, 17:20:42
 * Link: https://leetcode.com/problems/powx-n/
 */

class Solution {
    public double myPow(double x, int n) {
        long N = n; // handle overflow
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1;

        while (N > 0) {
            if (N % 2 == 1) {
                result *= x;
            }
            x *= x;
            N /= 2;
        }

        return result;
    }
}
