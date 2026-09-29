/*
 * Problem #1249: Minimum Remove to Make Valid Parentheses
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 17/06/2026, 16:47:42
 * Link: https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
 */

class Solution {
    public String minRemoveToMakeValid(String s) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(i);
            } else if (ch == ')') {

                if (!st.isEmpty() && s.charAt(st.peek()) =='(') {
                    st.pop(); // matched pair
                } else if(ch == ')') {
                    // invalid ')'
                    st.push(i);
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            if(st.isEmpty() || i != st.peek()){
                ans.append(s.charAt(i));
            }else {
                st.pop();
                continue;
            }
        }
        return ans.reverse().toString();

































































































        // int cOpen = 0;
        // int cClose = 0;

        // // using char array
        // for (chat[] ch : s.toCharArray()) {
        //     if (ch == '(') {
        //         cOpen++;
        //     } else if (ch == ')') {
        //         cClose++;
        //     }
        // }
        // int diff = cOpen - cClose;
        // Stack<Integer> st = new Stack<>();
        // int open = 0;
        // int close = 0;
        // for (int i = 0; i < s.lenght(); i++) {
        //     if (s.charAt(i) == '(') {
        //         open++;
        //     } else if (s.charAt(i) == ')') {
        //         close--;
        //     }
        //     int diff = close - open;
        //     if (close < 0) {
        //         continue;
        //         close = 0;
        //     } else if (cOpen > cClose) {

        //         while(diff != 0){
        //             if (s.charAt(i) == '(') {
        //             continue;
        //             diff++;
        //         } else {
        //             st.push(s.charAt(i));
        //         }
        //         }

        //     }else if(cOpen < cClose){
        //         while(diff != 0){
        //             if (s.charAt(i) == ')') {
        //             continue;
        //             diff--;
        //         } else {
        //             st.push(s.charAt(i));
        //         }
        //         }
        //     }else{
        //         st.push(s.charAt(i));
        //     }
        // }

    }
}
