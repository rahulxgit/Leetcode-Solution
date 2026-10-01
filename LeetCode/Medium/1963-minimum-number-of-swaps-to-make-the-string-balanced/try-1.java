/*
 * Problem #1963: Minimum Number of Swaps to Make the String Balanced
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 23/06/2026, 17:49:55
 * Link: https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/
 */

class Solution {
    public int minSwaps(String s) {
        // remove already balanced pranthesis
        // count bracket
        int open = 0;
        int close = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                open++;
            } else

            if (s.charAt(i) == ']' && open > 0) {
                open--;
                continue;
            }
        }
        // if ((open - 1) < 0)
        //     return 0;
        // if ((open - 1) == 0)
        //     return 1;
        return (open + 1) / 2;
    }
}
