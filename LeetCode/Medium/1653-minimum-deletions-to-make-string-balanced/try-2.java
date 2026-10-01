/*
 * Problem #1653: Minimum Deletions to Make String Balanced
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 21/06/2026, 17:10:19
 * Link: https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/
 */

class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int count = 0;
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < n; i++){
            if(!st.isEmpty() && s.charAt(i) == 'a' && st.peek() == 'b'){
                // b ka badd a hai
                st.pop();
                count++;
            }else{
                st.push(s.charAt(i));
            }
        }
        return count;
    }
}
