/*
 * Problem #456: 132 Pattern
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 21/06/2026, 22:59:18
 * Link: https://leetcode.com/problems/132-pattern/
 */

class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;

        // int nums_i = nums[0];   -----> gives TLE O(n)
        // for(int j = 1; j < n-1; j++){
        //     nums_i = Math.min(nums_i, nums[j]);
        //     for(int k = j+1; k < n; k++){
        //         if(nums_i < nums[k] && nums[k] < nums[j]){
        //             return true;
        //         }
        //     }
        // }

        int num3 = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            if(nums[i] < num3){
                return true;
            }

            while(!st.isEmpty() && st.peek() < nums[i]){
                num3 = st.peek();
                st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}
