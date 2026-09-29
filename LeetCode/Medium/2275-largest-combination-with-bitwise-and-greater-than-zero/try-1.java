/*
 * Problem #2275: Largest Combination With Bitwise AND Greater Than Zero
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 26/05/2026, 13:18:51
 * Link: https://leetcode.com/problems/largest-combination-with-bitwise-and-greater-than-zero/
 */

class Solution {
    public int largestCombination(int[] candidates) {
        // for large value 2^n >> n^2
        int max = 0;
        // for(int i = 0; i < candidates.length; i++){
        //     int and = candidates[i];
        //     int count = 1;
        //     for(int j = i + 1; j < candidates.length; j++){
        //         int curr = and & candidates[j];
        //         if(curr == 0){
        //             // exclude candidates[j]
        //             continue; // skip this element
        //         }
        //         and &= candidates[j];
        //         count++;
        //     }
        //     if(and > 0){
        //         max = Math.max(max, count);
        //     }
        // }


        for(int bitPos = 0; bitPos < 32; bitPos++){
            int currC = 0;
            for(int num : candidates){
                if((num & (1 << bitPos)) != 0){
                    currC++;
                }
            }
            max = Math.max(currC, max);
        }
        return max;  // O(n^2)
    }
}
