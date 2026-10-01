/*
 * Problem #258: Add Digits
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 16/06/2026, 18:26:04
 * Link: https://leetcode.com/problems/add-digits/
 */

class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            int sum = 0;

            while(num != 0){
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        num = sum;
        }
        return num;
    }
}
