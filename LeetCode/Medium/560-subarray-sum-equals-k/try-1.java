/*
 * Problem #560: Subarray Sum Equals K
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 09/03/2026, 14:24:14
 * Link: https://leetcode.com/problems/subarray-sum-equals-k/
 */

class Solution {
    public int subarraySum(int[] nums, int k) {
        // brute force
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
