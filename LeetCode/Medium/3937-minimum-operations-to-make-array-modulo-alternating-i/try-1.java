/*
 * Problem #3937: Minimum Operations to Make Array Modulo Alternating I
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 23/05/2026, 20:40:30
 * Link: https://leetcode.com/problems/minimum-operations-to-make-array-modulo-alternating-i/
 */

class Solution {
    public int minOperations(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        for(int x = 0; x < k; x++){
            for(int y = 0; y < k; y++){

                if(nums.length > 1 && x == y){
                    continue;
                }

                // if(x == y) continue;
                int ops = 0;
                for(int i = 0; i < nums.length; i++){
                    int rem = nums[i] % k;
                    int target = (i % 2 == 0) ? x : y;

                    int diff = Math.abs(rem - target);

                    ops += Math.min(diff, k - diff);
                }

                ans = Math.min(ans, ops);
            }
        }
        return ans;
    }
}
