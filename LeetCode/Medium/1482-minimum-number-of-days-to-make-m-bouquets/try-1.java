/*
 * Problem #1482: Minimum Number of Days to Make m Bouquets
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 31/03/2026, 17:44:23
 * Link: https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
 */

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int l = 0;
        int r = 0;

        for (int num : bloomDay) {
            r = Math.max(r, num);
        }

        // ✅ Correct edge case
        if ((long) m * k > n) return -1;

        int ans = -1;

        while(l <= r) {
            int mid = l + (r - l)/2;

            // ✅ reset for each day
            int count = 0;
            int bouquets = 0;

            for (int j = 0; j < n; j++) {
                
                if (bloomDay[j] <= mid) {
                    count++;
                } else {
                    count = 0;
                }

                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            }

            // ✅ use >= (important)
            if (bouquets >= m) {
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;    // need more days
            }
        }

        return ans;
    }
}
