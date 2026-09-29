/*
 * Problem #3964: Minimum Lights to Illuminate a Road
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 20/06/2026, 20:37:42
 * Link: https://leetcode.com/problems/minimum-lights-to-illuminate-a-road/
 */

class Solution {
    public int minLights(int[] lights) {
        int n = lights.length;
        int[] diff = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (lights[i] > 0) {
                int l = Math.max(0, i - lights[i]);

                int r = Math.min(n - 1, i + lights[i]);

                diff[l]++;
                diff[r + 1]--;
            }
        }

        int c = 0;
        int gap = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            c += diff[i];

            if (c == 0)
                gap++;
            else {
                ans += (gap + 2) / 3;
                gap = 0;
            }
        }

        return ans + (gap + 2) / 3;
    }
}
