/*
 * Problem #1047: Remove All Adjacent Duplicates In String
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 07/06/2026, 13:48:28
 * Link: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 */

class Solution {
    // // check duplicate exist or not
    // public boolean isValid(String s) {
    //     for (int i = 1; i < s.length(); i++) {
    //         if (s.charAt(i) == s.charAt(i - 1)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public String romoveAdjacent(String s) {

    //     int n = s.length();
    //     StringBuilder st = new StringBuilder();

    //     for (int i = 0; i < n; i++) {
    //         if (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
    //             i++;
    //         } else {
    //             st.append(s.charAt(i));
    //         }
    //     }
    //     return st.toString();
    // }

    public String removeDuplicates(String s) {
        // // brute force
        // while (true) {
        //     String next = romoveAdjacent(s);

        //     if (next.equals(s))
        //         break;

        //     s = next;
        // }

        // return s;
        // using stack

        Stack<Character> st = new Stack<>();
        int n = s.length();
        int i = 0;
        while(i < n){
            if(!st.isEmpty() && s.charAt(i) == st.peek()){
                st.pop();

            }else{
                st.push(s.charAt(i));
            }
            
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }
        return sb.reverse().toString();

    }
}
