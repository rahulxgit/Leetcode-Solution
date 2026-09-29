/*
 * Problem #1209: Remove All Adjacent Duplicates in String II
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 10/06/2026, 15:59:39
 * Link: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
 */

class Solution {
    class pair {
        Character ch;
        Integer no;

        pair(Character ch, Integer no) {
            this.ch = ch;
            this.no = no;
        }
    }

    public String removeDuplicates(String s, int k) {
        // Use a stack to store the characters, when there are k same characters, delete them. (class, int[])
        int n = s.length();
        Stack<pair> st = new Stack<>();

        int no = 0;
        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (st.isEmpty() || ch != st.peek().ch) { // is char repet or adjacent
                st.push(new pair(ch,1));
            } else {
                st.peek().no++;
                if(st.peek().no == k){
                    st.pop();
                }
            }

        }
        // stack - > string
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            
            pair p = st.pop();
            for(int i = 0; i < p.no; i++){
                sb.append(p.ch);
            }
        }

        return sb.reverse().toString();

    }
}
