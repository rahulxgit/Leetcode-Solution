/*
 * Problem #2124: Check if All A's Appears Before All B's
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 21/06/2026, 17:13:48
 * Link: https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
 */

class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        boolean count = true;
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < n; i++){
            if(!st.isEmpty() && s.charAt(i) == 'a' && st.peek() == 'b'){
                // b ka badd a hai
                st.pop();
                count = false;;
            }else{
                st.push(s.charAt(i));
            }
        }
        return count;
    }
}
