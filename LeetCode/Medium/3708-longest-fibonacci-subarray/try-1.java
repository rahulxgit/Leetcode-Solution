/*
 * Problem #3708: Longest Fibonacci Subarray
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/10/2025, 20:42:31
 * Link: https://leetcode.com/problems/longest-fibonacci-subarray/
 */

class Solution {
    public int longestSubarray(int[] nums) {
       int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        int maxLen = 2;
        int currLen = 2;
        for(int  i = 2; i < nums.length; i++){
            if((long)nums[i] == (long) nums[i -1] + (long) nums[i-2]){
                currLen++;
            }
            else{
                currLen = 2; // restart countinfds
            }
            maxLen = Math.max(maxLen, currLen);
        }
        return maxLen ;
    }
}
