/*
 * Problem #3498: Reverse Degree of a String
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 20/09/2026, 14:24:27
 * Link: https://leetcode.com/problems/reverse-degree-of-a-string/
 */

class Solution {
    public int reverseDegree(String s) {
        // return 'b' - 'z' + 26; //'z' - 'b' + 1;
        int pdc = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int rev = 'z' - ch + 1;
            int idc = i + 1;
            // int idc = ch - 'z' + 26;
            pdc += rev * idc;
        }
        return pdc;
    }
}
