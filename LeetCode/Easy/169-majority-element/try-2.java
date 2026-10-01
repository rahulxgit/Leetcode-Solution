/*
 * Problem #169: Majority Element
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 07/03/2026, 00:01:55
 * Link: https://leetcode.com/problems/majority-element/
 */

class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;

        for(int i = 0; i < n; i++){
            int count = 0;

            for(int j =0; j < n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count > n/2){
                return nums[i];
            }
        }

        return -1;
    }
}
