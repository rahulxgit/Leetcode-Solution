/*
 * Problem #3635: Earliest Finish Time for Land and Water Rides II
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 03/06/2026, 21:21:43
 * Link: https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-ii/
 */

import java.util.*;

class Solution {

    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        long ans = Long.MAX_VALUE;

        // Land -> Water
        ans = Math.min(ans,
                solve(landStartTime, landDuration,
                      waterStartTime, waterDuration));

        // Water -> Land
        ans = Math.min(ans,
                solve(waterStartTime, waterDuration,
                      landStartTime, landDuration));

        return (int) ans;
    }

    private long solve(int[] firstStart, int[] firstDuration,
                       int[] secondStart, int[] secondDuration) {

        int m = secondStart.length;

        int[][] rides = new int[m][2];

        for (int i = 0; i < m; i++) {
            rides[i][0] = secondStart[i];
            rides[i][1] = secondDuration[i];
        }

        Arrays.sort(rides, (a, b) -> a[0] - b[0]);

        // prefix minimum duration
        long[] prefixMinDur = new long[m];
        prefixMinDur[0] = rides[0][1];

        for (int i = 1; i < m; i++) {
            prefixMinDur[i] = Math.min(prefixMinDur[i - 1], rides[i][1]);
        }

        // suffix minimum (startTime + duration)
        long[] suffixMin = new long[m];
        suffixMin[m - 1] = (long) rides[m - 1][0] + rides[m - 1][1];

        for (int i = m - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(
                suffixMin[i + 1],
                (long) rides[i][0] + rides[i][1]
            );
        }

        long ans = Long.MAX_VALUE;

        for (int i = 0; i < firstStart.length; i++) {

            long finishFirst = (long) firstStart[i] + firstDuration[i];

            int idx = upperBound(rides, finishFirst);

            // rides with startTime <= finishFirst
            if (idx > 0) {
                ans = Math.min(
                    ans,
                    finishFirst + prefixMinDur[idx - 1]
                );
            }

            // rides with startTime > finishFirst
            if (idx < m) {
                ans = Math.min(
                    ans,
                    suffixMin[idx]
                );
            }
        }

        return ans;
    }

    private int upperBound(int[][] rides, long target) {

        int left = 0;
        int right = rides.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (rides[mid][0] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
