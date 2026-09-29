/*
 * Problem #224: Basic Calculator
 * Difficulty: Hard
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/06/2026, 22:39:36
 * Link: https://leetcode.com/problems/basic-calculator/
 */

import java.util.*;

class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();

        int num = 0;
        int res = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } 
            else if (ch == '+') {
                res += num * sign;
                num = 0;
                sign = 1;
            } 
            else if (ch == '-') {
                res += num * sign;
                num = 0;
                sign = -1;
            } 
            else if (ch == '(') {
                st.push(res);
                st.push(sign);

                res = 0;
                sign = 1;
                num = 0;
            } 
            else if (ch == ')') {
                res += num * sign;

                num = 0;

                res *= st.pop(); // previous sign
                res += st.pop(); // previous result
            }
        }

        res += num * sign;

        return res;
    }
}
