/*
 * Problem #921: Minimum Add to Make Parentheses Valid
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 23/06/2026, 17:10:02
 * Link: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
 */

class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int open = 0;
        int close = 0;
        for(int i = 0; i < s.length(); i++){
            
            if(!st.isEmpty() && st.peek() == '(' && s.charAt(i) == ')'){
                st.pop();
                continue;

            }else{
                st.push(s.charAt(i));
            }
        }
        return st.size();
    }
}
