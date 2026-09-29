/*
 * Problem #2144: Minimum Cost of Buying Candies With Discount
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 01/06/2026, 16:33:13
 * Link: https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/
 */

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        int count = 0;

        for(int i = cost.length -1; i >= 0; i--){
            if((count == 2)){
                count = 0;
                continue;
            }
            
            sum += cost[i];
            count++;
        }
        return sum;
    }
}
