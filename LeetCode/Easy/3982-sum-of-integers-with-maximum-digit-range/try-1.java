/*
 * Problem #3982: Sum of Integers with Maximum Digit Range
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 05/07/2026, 08:10:08
 * Link: https://leetcode.com/problems/sum-of-integers-with-maximum-digit-range/
 */

class Solution {
    public int maxDigitRange(int[] nums) {
        int mr = -1;
        int sum = 0;

        for(int num : nums){
            int x = num;
            int mn = 9;
            int mx = 0;

            while(x > 0){
                int d = x % 10;
                mn = Math.min(mn, d);
                mx = Math.max(mx, d);
                x /= 10;
            }

            int range = mx - mn;

            if(range > mr){
                mr = range;
                sum = num;
            }else if(range == mr){
                sum += num;
            }
        }
        return sum;
    }
}
