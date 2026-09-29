/*
 * Problem #509: Fibonacci Number
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 21/06/2026, 17:21:44
 * Link: https://leetcode.com/problems/fibonacci-number/
 */

class Solution {
    public int fab(int n){
        // base case
        // fab(0) = 0;
        // fab(1) = 1;
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fab(n-1) + fab(n-2);
    }
    public int fib(int n) {
        return fab(n);
    }
}
