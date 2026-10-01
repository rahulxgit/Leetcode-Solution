/*
 * Problem #3702: Longest Subsequence With Non-Zero Bitwise XOR
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 05/10/2025, 09:01:06
 * Link: https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/
 */

class Solution {
    public int longestSubsequence(int[] nums) {
        int xorValue = 0;
        boolean hasNonZero = false;
        //Compute Xor of all elements
        for(int i = 0; i< nums.length; i++){
            xorValue ^= nums[i];
            if(nums[i] != 0) hasNonZero = true;
        }
        // for(int i = 0; i<nums.length; i++){
        //     int xorAll = 0;
        //     for(int j = 0; j < nums.length; j++){
        //         if(i != j) xorAll ^= nums[j];
        //     }
        // }
        //if full arr xor is non zero -> take all el
        if(xorValue != 0){
            return nums.length;
        }
        // for(int i = 0; i<nums.length; i++){
        //     if(nums[i] != 0){
        //         return 1;
        //     }
        // }
        
        //else must remove
        if(!hasNonZero) return 0;
        
        return nums.length - 1;
    }
}
