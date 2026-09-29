/*
 * Problem #3881: Direction Assignments with Exactly K Visible People
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 28/03/2026, 20:36:25
 * Link: https://leetcode.com/problems/direction-assignments-with-exactly-k-visible-people/
 */

import java.util.*;
import java.math.BigInteger;
class Solution {
    private static final int MOD = 1_000_000_007;
    public int countVisiblePeople(int n, int pos, int k) {
        if(k > n - 1) return 0;

        long res = 2;

        long num = 1, den = 1;
        k = Math.min(k , n - 1 - k);
        for(int i = 0; i < k; i++){
            num = (num * (n - 1 - i)) % MOD;

            den = (den * (i + 1)) % MOD;
        }

        long nCr = (num * BigInteger.valueOf(den).modInverse(BigInteger.valueOf(MOD)).longValue()) % MOD;

        return (int) ((nCr * 2) % MOD);
    }
}
