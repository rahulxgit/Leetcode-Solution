/*
 * Problem #2574: Left and Right Sum Differences
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 06/06/2026, 16:35:34
 * Link: https://leetcode.com/problems/left-and-right-sum-differences/
 */

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int ls[] = new int[n];
        int rs[] = new int[n];
        int arr[] = new int[n];

        int sum = 0;
        ls[0] = 0;
        for(int i = 1; i < n; i++){
            sum += nums[i-1];
            ls[i] = sum;
        }


        int sum1 = 0;
        rs[n-1] = 0;
        for(int i = n-2; i >= 0; i--){
            sum1 += nums[i+1];
            rs[i] = sum1;
        }
  

        for(int i = 0; i < n; i++){
            arr[i] = Math.abs(rs[i] - ls[i]);
        }

        return arr;


    }
}
