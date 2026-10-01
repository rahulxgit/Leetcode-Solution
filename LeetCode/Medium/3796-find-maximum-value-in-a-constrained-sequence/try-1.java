/*
 * Problem #3796: Find Maximum Value in a Constrained Sequence
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 03/01/2026, 20:53:16
 * Link: https://leetcode.com/problems/find-maximum-value-in-a-constrained-sequence/
 */

import java.util.*;
class Solution {
    public int findMaxVal(int n, int[][] restrictions, int[] diff) {
        long[] mA = new long[n];
        Arrays.fill(mA, Long.MAX_VALUE);

        mA[0] = 0;

        for(int r[] : restrictions){
            int index = r[0];
            int value = r[1];
            mA[index] = Math.min(mA[index], value);
        }
        for(int i = 0; i < n-1; i++){
            mA[i+1] = Math.min(mA[i+1],  mA[i]+ diff[i]);
        }
        for(int i = n - 2; i>= 0; i--){
            mA[i] = Math.min(mA[i], mA[i + 1] + diff[i]);
        }
        long mV = 0;
        for(long val : mA){
            mV = Math.max(mV, val);
        }
        return(int) mV;
    }
}
