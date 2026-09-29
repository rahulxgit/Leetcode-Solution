/*
 * Problem #3740: Minimum Distance Between Three Equal Elements I
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 10/04/2026, 14:41:30
 * Link: https://leetcode.com/problems/minimum-distance-between-three-equal-elements-i/
 */

class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;

        if(n < 3){
            return -1;
        }
        int ans = Integer.MAX_VALUE;  // +INFINITE

        for (int i = 0; i < n; i++) {
            // int sum = 0;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    // two times occur
                    for (int k = j + 1; k < n; k++) {
                        if(nums[j] == nums[k]){
                            int sum = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                            ans = Math.min(ans, sum);
                            // if(ans < sum){
                            // ans = sum;
                            // }
                        }
                    }
                }
            }
            // ans = Math.min(ans, sum);
            // // if(ans < sum){
            // //     ans = sum;
            // // }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
