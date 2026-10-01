/*
 * Problem #20: Valid Parentheses
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 25/05/2026, 19:18:54
 * Link: https://leetcode.com/problems/valid-parentheses/
 */

class Solution {
    public boolean isValid(String s) {

        char[] arr = new char[s.length()];
        int top = -1;

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // opening brackets
            if(ch == '(' || ch == '[' || ch == '{') {
                top++;
                arr[top] = ch;
            }

            // closing brackets
            else {

                if(top == -1) {
                    return false;
                }

                if(ch == ')' && arr[top] == '(') {
                    top--;
                }
                else if(ch == ']' && arr[top] == '[') {
                    top--;
                }
                else if(ch == '}' && arr[top] == '{') {
                    top--;
                }
                else {
                    return false;
                }
            }
        }

        return top == -1;
    }
}
