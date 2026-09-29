/*
 * Problem #3737: Count Subarrays With Majority Element I
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 29/06/2026, 01:44:05
 * Link: https://leetcode.com/problems/count-subarrays-with-majority-element-i/
 */

class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        // brute force O(n*2)may be not work here
        // find all subarray

        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int freq = 0;
            for (int j = i; j < n; j++) { // all subarray
                
                if(nums[j] == target){
                    freq++;
                }
                int len = j - i + 1;
                if(freq > len / 2){
                    count++;
                }
            }
        }
        return count;
    }

}
