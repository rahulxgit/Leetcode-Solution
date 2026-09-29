/*
 * Problem #3783: Mirror Distance of an Integer
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 18/04/2026, 13:44:34
 * Link: https://leetcode.com/problems/mirror-distance-of-an-integer/
 */

class Solution {
    public int reverse(int n) {
        int reverseDigit = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverseDigit = reverseDigit * 10 + lastDigit;
            n = n / 10;
        }
        return reverseDigit;
    }

    public int mirrorDistance(int n) {

        return Math.abs(n - reverse(n));
    }
}
