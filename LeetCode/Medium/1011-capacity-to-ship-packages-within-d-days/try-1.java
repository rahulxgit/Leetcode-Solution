/*
 * Problem #1011: Capacity To Ship Packages Within D Days
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 31/03/2026, 19:54:33
 * Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
 */

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        
        int l = 0;
        int r = 0;

        for(int num : weights){
            l = Math.max(l, num);  // min capacity
            r += num;              // max capacity
        }

        int ans = -1;
        while(l <= r){
            int mid = l + (r - l) / 2;

            int sum = 0;
            int day = 1;

            for(int i = 0; i < n; i++){
                sum += weights[i];

                if(sum > mid){
                    day++;
                    sum = weights[i];
                }
                // else{
                //     sum += weights[i];
                // }
            }
            if(day > days){
                l = mid + 1;
            }else{ ///   day < days  == capicity inc then mid inc
                ans = mid;
                r = mid - 1;
            }
        }
        return ans;
    }
}
