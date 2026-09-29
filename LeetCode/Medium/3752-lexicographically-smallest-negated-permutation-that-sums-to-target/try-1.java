/*
 * Problem #3752: Lexicographically Smallest Negated Permutation that Sums to Target
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 22/11/2025, 21:11:52
 * Link: https://leetcode.com/problems/lexicographically-smallest-negated-permutation-that-sums-to-target/
 */

class Solution {
    public int[] lexSmallestNegatedPerm(int n, long target) {
        long total = (long) n * (n + 1) / 2 ;
        if(Math.abs(target) > total)return new int[0];
        if(((total + target) & 1L) != 0L) return new int[0];

        long negSum = (total - target) / 2;
        boolean[] isNeg = new boolean[n + 1];

        for(int k = n; k >= 1; k--){
            if(negSum < k) continue;
            long remaining = negSum - k;
            long maxRemainingSum = (long) k * (k - 1) /2;

            if(remaining <= maxRemainingSum){
                isNeg[k] = true;
                negSum -= k;
            }
        }
        if(negSum != 0) return new int[0];

        int[] ans = new int [n];
        int idx = 0;

        for(int k = n; k >= 1; k--){
            if(isNeg[k]) ans[idx++] = -k;
        }
        for(int k = 1; k <= n; k++){
            if(!isNeg[k]) ans[idx++] = k;
        }

        return ans;
    }
}
