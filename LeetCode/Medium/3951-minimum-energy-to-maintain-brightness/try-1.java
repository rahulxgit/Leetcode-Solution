/*
 * Problem #3951: Minimum Energy to Maintain Brightness
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 06/06/2026, 20:49:32
 * Link: https://leetcode.com/problems/minimum-energy-to-maintain-brightness/
 */

class Solution {
    public long minEnergy(int n, int brightness, int[][] intervals) {
        // find interval length sort on this basis of st time

         Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        long activeTime = 0;

        long st = intervals[0][0];
        long end = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= end + 1){
                end = Math.max(end, intervals[i][1]);
            }else{
                activeTime += end - st + 1;
                st = intervals[i][0];
                end = intervals[i][1];
            }
            
        }

        activeTime += end - st + 1;
        
        // find no of bulbs required to illuminated
        long bulbOn = (brightness + 2L) / 3;
        long ans = activeTime * bulbOn;
        return ans;
    }
}
