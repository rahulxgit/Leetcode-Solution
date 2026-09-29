/*
 * Problem #3750: Minimum Number of Flips to Reverse Binary String
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 22/11/2025, 20:22:08
 * Link: https://leetcode.com/problems/minimum-number-of-flips-to-reverse-binary-string/
 */

class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);
        int l = 0;
        int r = s.length()-1;
        int flips = 0;

        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                flips += 2;
            }
            l++;
            r--;
        }
        return flips;
    }
}
