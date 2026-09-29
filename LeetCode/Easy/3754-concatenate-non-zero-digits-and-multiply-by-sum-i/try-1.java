/*
 * Problem #3754: Concatenate Non-Zero Digits and Multiply by Sum I
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 07/07/2026, 16:56:25
 * Link: https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/
 */

class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb = new StringBuilder();
        long sum = 0;
        while(n != 0){
            int digit = n % 10;
            if(digit != 0){
                sum += digit;
                sb.append(digit);
            }
            n = n / 10;
        }
        if(sb.length() == 0){
            return 0;
        }
        long x = Long.parseLong(sb.reverse().toString());
        return x * sum;
    }
}
