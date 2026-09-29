/*
 * Problem #1021: Remove Outermost Parentheses
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 02/04/2026, 15:40:52
 * Link: https://leetcode.com/problems/remove-outermost-parentheses/
 */

class Solution {
    public String removeOuterParentheses(String s) {
        // use StringBuilder
        int n = s.length();
        int count = 0;
        // String ans = "";
        StringBuilder ans = new StringBuilder();
        for(int i= 0; i < n; i++){
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count != 0){
                ans.append(s.charAt(i));
                // ans += s.charAt(i);
            }
            if(s.charAt(i) == '('){
                count++;
            }
        }
        return ans.toString();
    }
}
