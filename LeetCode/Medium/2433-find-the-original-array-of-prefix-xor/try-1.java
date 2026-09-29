/*
 * Problem #2433: Find The Original Array of Prefix Xor
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/05/2026, 15:52:44
 * Link: https://leetcode.com/problems/find-the-original-array-of-prefix-xor/
 */

class Solution {
    public int[] findArray(int[] pref) {
        int arr[] = new int[pref.length];
       arr[0] = pref[0];
       for(int i = 1; i < pref.length; i++){
        arr[i] = pref[i] ^ pref[i-1];
       } 
       return arr;
    }
}
