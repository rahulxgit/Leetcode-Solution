/*
 * Problem #1732: Find the Highest Altitude
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 19/06/2026, 16:42:55
 * Link: https://leetcode.com/problems/find-the-highest-altitude/
 */

class Solution {
    public int largestAltitude(int[] gain) {
        // 1 way brute force
        int n = gain.length;
        int arr[] = new int[n+1];

        arr[0] = 0;

        int max = Integer.MIN_VALUE;
        int sum = arr[0];
        int j = 0;
        for(int i = 1; i <= n; i++){
            sum = arr[i-1] + gain[j];
            j++;
            arr[i] = sum;
            max = Math.max(max, arr[i]);
        }
        if(max < 0){
            return 0;
        }
        return max;

    }
}
