/*
 * Problem #1404: Number of Steps to Reduce a Number in Binary Representation to One
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 21/05/2026, 17:55:05
 * Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/
 */

class Solution {
    public int numSteps(String s) {
        int n = s.length();
        int op = 0;
        int carry = 0;

        for(int i = n-1; i >= 1; i--){
            if(((s.charAt(i) - '0') + carry) % 2 == 1){ //odd
                op += 2;
                carry = 1;
            }else{
                op += 1;
            }
        }
        return op + carry;
    }
}
