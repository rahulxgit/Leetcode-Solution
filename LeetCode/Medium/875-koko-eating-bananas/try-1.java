/*
 * Problem #875: Koko Eating Bananas
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 28/03/2026, 17:26:30
 * Link: https://leetcode.com/problems/koko-eating-bananas/
 */

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int l = 1;
        int r = 0;

        for (int pile : piles) {
            r = Math.max(r, pile);
        }

        while (l < r) {
            int mid = l + (r - l) / 2;
            // calculate total hours
            int total_hours = 0;
            for (int i = 0; i < n ; i++) {
                if (piles[i] % mid == 0) {
                    total_hours += piles[i] / mid;
                } else {
                    total_hours += piles[i] / mid + 1;
                }
            }
            if (total_hours > h) {
                // serach on left side
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
