/*
 * Problem #1680: Concatenation of Consecutive Binary Numbers
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 01/06/2026, 22:40:37
 * Link: https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/
 */

class Solution {
    public int concatenatedBinary(int n) {
        // find no if bit in n - brute force loop

        // int totalBits = 0;
        // while(n != 0){
        //     totalBits++;
        //     n >>= 1;
        // }

        int M = 1000000000 + 7;

        long res = 0;
        for (int num = 1; num <= n; num++) {
            // int bits = 0;
            // while(num != 0){
            //     bits++;
            //     num >>= 1;
            // }
            int bits = (int)(Math.log(num) / Math.log(2)) + 1;
            // int bits = 32 - Integer.numberOfLeadingZeros(num);

            res = ((res << bits) + num) % M;
        }
        return (int)res;
    }
}
