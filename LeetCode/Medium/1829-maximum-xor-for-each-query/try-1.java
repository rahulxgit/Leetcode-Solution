/*
 * Problem #1829: Maximum XOR for Each Query
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 26/05/2026, 17:12:51
 * Link: https://leetcode.com/problems/maximum-xor-for-each-query/
 */

class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int ans[] = new int[nums.length];

        // prfix xor
        int preXor[] = new int[nums.length];
        preXor[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            preXor[i] = preXor[i-1] ^ nums[i];
        }

        int k = (int)Math.pow(2,maximumBit);
        int idx = 0;

        int noOfBits = maximumBit ;
        int mask = (1 << noOfBits) -1;
        for(int i = preXor.length - 1; i >= 0; i--){
            int temp =  preXor[i] ^ mask;  // all bit flip of preXor[i] i.e ideally best k
            ans[idx] = temp;
            idx++;
        }
        return ans;
    }
}
