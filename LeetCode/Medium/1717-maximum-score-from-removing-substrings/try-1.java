/*
 * Problem #1717: Maximum Score From Removing Substrings
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 20/06/2026, 15:46:19
 * Link: https://leetcode.com/problems/maximum-score-from-removing-substrings/
 */

class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st = new Stack<>();
        int p = 0;

        if (y > x) { // remove "ba" first

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (!st.isEmpty() && st.peek() == 'b' && ch == 'a') {
                    st.pop();
                    p += y;
                } else {
                    st.push(ch);
                }
            }

            // rebuild remaining string
            StringBuilder sb = new StringBuilder();
            while (!st.isEmpty()) {
                sb.append(st.pop());
            }
            sb.reverse();

            // remove "ab"
            Stack<Character> st2 = new Stack<>();

            for (int i = 0; i < sb.length(); i++) {
                char ch = sb.charAt(i);

                if (!st2.isEmpty() && st2.peek() == 'a' && ch == 'b') {
                    st2.pop();
                    p += x;
                } else {
                    st2.push(ch);
                }
            }

        } else { // remove "ab" first

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (!st.isEmpty() && st.peek() == 'a' && ch == 'b') {
                    st.pop();
                    p += x;
                } else {
                    st.push(ch);
                }
            }

            // rebuild remaining string
            StringBuilder sb = new StringBuilder();
            while (!st.isEmpty()) {
                sb.append(st.pop());
            }
            sb.reverse();

            // remove "ba"
            Stack<Character> st2 = new Stack<>();

            for (int i = 0; i < sb.length(); i++) {
                char ch = sb.charAt(i);

                if (!st2.isEmpty() && st2.peek() == 'b' && ch == 'a') {
                    st2.pop();
                    p += y;
                } else {
                    st2.push(ch);
                }
            }
        }

        return p;
    }
}
