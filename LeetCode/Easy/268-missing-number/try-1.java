/*
 * Problem #268: Missing Number
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 07/03/2026, 16:14:18
 * Link: https://leetcode.com/problems/missing-number/
 */

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        // array sum
        int arrSum = 0;
        for(int i = 0; i < n; i++){
            arrSum += nums[i];
        }
        int missingNo = sum - arrSum;
        return missingNo;
    }
}
