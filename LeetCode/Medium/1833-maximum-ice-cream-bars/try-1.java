/*
 * Problem #1833: Maximum Ice Cream Bars
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 21/06/2026, 20:19:34
 * Link: https://leetcode.com/problems/maximum-ice-cream-bars/
 */

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum = 0;
        int c = 0;
        for(int i = 0; i < costs.length; i++){
            sum += costs[i];
            if(sum <= coins){
                // sum += costs[i];
                c++;
            }else{
                break;
            }
        }
        return c;
    }
}
