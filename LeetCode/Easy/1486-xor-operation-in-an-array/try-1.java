/*
 * Problem #1486: XOR Operation in an Array
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/05/2026, 16:17:22
 * Link: https://leetcode.com/problems/xor-operation-in-an-array/
 */

class Solution {
    public int xorOperation(int n, int start) {
        int arr[] = new int[n];
        int ans = 0;
        for(int i = 0; i < n; i++){
            arr[i] = start + 2 * i;
            ans ^= arr[i];
        }
        return ans;
    }
}
