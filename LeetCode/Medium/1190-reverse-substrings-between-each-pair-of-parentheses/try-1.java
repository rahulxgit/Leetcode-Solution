/*
 * Problem #1190: Reverse Substrings Between Each Pair of Parentheses
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 21/06/2026, 00:53:18
 * Link: https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/
 */

class Solution {
    public String reverseParentheses(String s) {
        // brute force  use StringBuilder + stack
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        Stack<Integer> lastSkipLen = new Stack<>();

        int len = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                lastSkipLen.push(sb.length());
                len = sb.length();
            } else if (ch == ')') {
                int l = lastSkipLen.pop();

                String rev = new StringBuilder(sb.substring(l))
                        .reverse()
                        .toString();

                sb.delete(l, sb.length());
                sb.append(rev);
            } else {
                sb.append(ch);
            }
            // if(ch == ')'){
            //     String rev = new StringBuilder(sb.substring(len)).reverse().toString();
            //     sb.delete(len,sb.length());

            //     sb.append(rev);
            //     len = 0;
            // }else if(ch != '(') {
            //     sb.append(ch);
            // }
        }

        return sb.toString();
        // warmhole teleporation theroy

    }
}
