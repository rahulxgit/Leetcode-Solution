/*
 * Problem #2390: Removing Stars From a String
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 10/06/2026, 17:07:32
 * Link: https://leetcode.com/problems/removing-stars-from-a-string/
 */

class Solution {
    public String removeStars(String s) {
        // using stack
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '*') { // * found and empty stack exception handling
                st.pop();
            } else {
                st.push(ch);
            }

        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.peek());
            st.pop();
        }
        return sb.reverse().toString();
    }
}
