/*
 * Problem #3950: Exactly One Consecutive Set Bits Pair
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 06/06/2026, 20:11:31
 * Link: https://leetcode.com/problems/exactly-one-consecutive-set-bits-pair/
 */

class Solution {
    public boolean consecutiveSetBits(int n) {
        int count  =0;
        while(n != 0){
            if((n & 1) == 1 &&  (((n >> 1) & 1) == 1) ){
               count++;
            }
            n >>= 1;
        }
        // if()
        return (count == 1);
    }
}
