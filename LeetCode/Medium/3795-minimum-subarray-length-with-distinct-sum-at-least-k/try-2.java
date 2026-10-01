/*
 * Problem #3795: Minimum Subarray Length With Distinct Sum At Least K
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 03/01/2026, 20:21:52
 * Link: https://leetcode.com/problems/minimum-subarray-length-with-distinct-sum-at-least-k/
 */

import java.util.*;
class Solution {
    public int minLength(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        long dSum = 0;
        int left = 0;
        int ans = Integer.MAX_VALUE;

        for(int right = 0; right < n; right++){
            int x = nums[right];
            int count = freq.getOrDefault(x,0);
            if(count == 0){
                dSum += x;
            }
            freq.put(x, count + 1);
            while(dSum >= k && left <= right){
                ans = Math.min(ans, right - left + 1);

                int y = nums[left];
                int c = freq.get(y);
                if(c == 1){
                    dSum -= y;
                    freq.remove(y);
                }else{
                    freq.put(y,c - 1);
                }
                left++;
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
