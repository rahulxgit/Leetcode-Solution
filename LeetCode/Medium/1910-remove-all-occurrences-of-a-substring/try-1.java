/*
 * Problem #1910: Remove All Occurrences of a Substring
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 23/06/2026, 20:19:21
 * Link: https://leetcode.com/problems/remove-all-occurrences-of-a-substring/
 */

class Solution {
    public boolean match(String str, String part) {
        if (str.equals(part)) {
            return true;
        }
        return false;
    }

    public String removeOccurrences(String s, String part) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
            if (st.size() >= part.length()) {
                String str = "";
                for (int j = st.size() - part.length(); j < st.size(); j++) {
                    str += st.get(j);
                }
                if (match(str, part)) {
                    for (int k = 0; k < part.length(); k++) {
                        st.pop();
                    }
                }
            }

        }

        // stack- string
        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}
