/*
 * Problem #3614: Process String with Special Operations II
 * Difficulty: Hard
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 17/06/2026, 13:08:37
 * Link: https://leetcode.com/problems/process-string-with-special-operations-ii/
 */

class Solution {
    public char processStr(String s, long k) {
        // remove last char by using - subString and stringBuilder via .toString

        // return kth charcter and take MOD because k is very large
        // dont build string track len and find kth el

        long len = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '*') {
                if (len > 0)
                    len--;

            } else if (ch == '#') {
                len *= 2;

            } else if (ch == '%') {
                // reverse dont change length

            } else {
                len++;
            }
        }

        if (k >= len) {
            return '.';
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch == '%') {

                k = len - 1 - k;

            } else if (ch == '#') {

                len /= 2;

                if (len > 0) {
                    k %= len;
                }

            } else if (ch == '*') {

                len++;

            } else {

                if (k == len - 1) {
                    return ch;
                }

                len--;
            }
        }

        return '.';
    }
}
