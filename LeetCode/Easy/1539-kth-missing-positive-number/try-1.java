/*
 * Problem #1539: Kth Missing Positive Number
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 30/03/2026, 19:18:34
 * Link: https://leetcode.com/problems/kth-missing-positive-number/
 */

class Solution {
    public int findKthPositive(int[] arr, int k) {
        // ith position se phle kitna no miss hai
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int count_of_missing_no = arr[i] - (i + 1);
            if(count_of_missing_no >= k){
                // it should be our answer
                // return kth msiining no
                return k + i;
            }
        }
        return k + n; // special case if arr in inc by 1
    }
}
