/*
 * Problem #1318: Minimum Flips to Make a OR b Equal to c
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 08/05/2026, 01:17:52
 * Link: https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/
 */

class Solution {
    public int minFlips(int a, int b, int c) {

        int count = 0;

        while (a != 0 || b != 0 || c != 0) {

            // if current bit of c is 1
            if ((c & 1) == 1) {

                // both bits are 0
                // need one flip
                if ((a & 1) == 0 && (b & 1) == 0) {
                    count++;
                }

            } else {

                // if current bit of c is 0
                // remove all 1s from a and b

                count += (a & 1) + (b & 1);

                // alternative way
                // if ((a & 1) == 1) {
                //     count++;
                // }
                // if ((b & 1) == 1) {
                //     count++;
                // }
            }

            // right shift
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }

        return count;
    }
}
