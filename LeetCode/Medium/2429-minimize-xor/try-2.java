/*
 * Problem #2429: Minimize XOR
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 29/05/2026, 16:30:45
 * Link: https://leetcode.com/problems/minimize-xor/
 */

class Solution {
    public int minimizeXor(int num1, int num2) {
        int c2 = Integer.bitCount(num2);

        int x = num1;
        int x1 = Integer.bitCount(x);

        // Remove extra set bits from LSB side
        while (x1 > c2) {
            x = x & (x - 1); // removes lowest set bit
            x1--;
        }

        // Add missing set bits at lowest unset positions
        while (x1 < c2) {
            x = x | (x + 1); // sets lowest unset bit
            x1++;
        }

        return x;
    }
}
