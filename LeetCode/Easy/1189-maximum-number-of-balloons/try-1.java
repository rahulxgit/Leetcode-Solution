/*
 * Problem #1189: Maximum Number of Balloons
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 22/06/2026, 16:46:21
 * Link: https://leetcode.com/problems/maximum-number-of-balloons/
 */

class Solution {
    public int maxNumberOfBalloons(String text) {
        // hash  map or hash set  0R using sorting
        // counting freq
        int bc = 0, ac = 0, lc = 0, oc = 0, nc = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'b') {
                bc++;
            } else if (text.charAt(i) == 'a') {
                ac++;
            } else if (text.charAt(i) == 'l') {
                lc ++;
            } else if (text.charAt(i) == 'o') {
                oc ++;
            } else if (text.charAt(i) == 'n') {
                nc++;
            }
        }
        lc = lc/2;
        oc = oc/2;
        // find min of all count alleast sab 1 bar to exist krna hi chaiya
        return Math.min(
                Math.min(bc, ac),
                Math.min(Math.min(lc, oc), nc)
        );
    }
}
