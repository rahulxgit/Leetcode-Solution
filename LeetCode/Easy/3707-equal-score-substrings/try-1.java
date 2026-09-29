/*
 * Problem #3707: Equal Score Substrings
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/10/2025, 20:23:20
 * Link: https://leetcode.com/problems/equal-score-substrings/
 */

class Solution {
    public boolean scoreBalance(String s) {
        int n = s.length();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = s.charAt(i) - 'a' + 1;
        }
        int totalSum = 0;
        //total sum
        for(int i = 0; i < n; i ++){
            totalSum += a[i];
        }
        int leftSum = 0;
        // int rightSum = 0;
        for(int i = 0; i < n; i++){
            leftSum += a[i];
            int rightSum = totalSum - leftSum;

            if(leftSum == rightSum){
                return true;
            }
        }
        return false;
    }
}
