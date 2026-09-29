/*
 * Problem #2997: Minimum Number of Operations to Make Array XOR Equal to K
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 19/05/2026, 15:32:10
 * Link: https://leetcode.com/problems/minimum-number-of-operations-to-make-array-xor-equal-to-k/
 */

class Solution {
    public int minOperations(int[] nums, int k) {
        int totalXor = 0;
        for(int i = 0; i < nums.length; i++){
            totalXor ^= nums[i];
        }
        // compare with k
        int diff = totalXor^k; // totalDiffb bit = no of set bit in diff
        int count = 0;
        while(diff != 0){
            if((diff & 1) == 1){
                count++;
            }
            diff = diff >> 1;
        }
        return count++;
    }
}
