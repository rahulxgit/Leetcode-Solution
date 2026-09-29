/*
 * Problem #1922: Count Good Numbers
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 17/04/2026, 18:05:36
 * Link: https://leetcode.com/problems/count-good-numbers/
 */

class Solution {
    static final int MOD = 1000000007;
    // binary exponentation
    public long findPow(int a, long b) {
        // edge case 
        if (b == 0) {
            return 1;
        }
        // findPow(a, b / 2);

        long half = findPow(a, b / 2);
        long result = (half * half) % MOD;
        if (b % 2 == 1) {
            result = (result * a) % MOD;
        }
        return result;
    }

    public int countGoodNumbers(long n) {


        long ans = (findPow(5, (n+1)/2) * findPow(4, n/2)) % MOD;
        return (int)ans;
    }
}
