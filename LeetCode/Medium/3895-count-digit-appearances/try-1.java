/*
 * Problem #3895: Count Digit Appearances
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/04/2026, 21:14:59
 * Link: https://leetcode.com/problems/count-digit-appearances/
 */

class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n = nums.length;
        int count = 0;

        for(int i =0;i<n;i++){

            while(nums[i] > 0){
                if(nums[i] % 10 == digit){
                    count++;
                }
                nums[i] = nums[i] / 10;
            }
        }
        return count;
    }
}
