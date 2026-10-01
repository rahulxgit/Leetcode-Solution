/*
 * Problem #150: Evaluate Reverse Polish Notation
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/06/2026, 16:24:12
 * Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/
 */

class Solution {
    public int evalRPN(String[] tokens) {
        // split by comma and store in stack 
        Stack<Integer> st = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") && !st.isEmpty()) {
                int sum = st.peek();
                st.pop();
                sum += st.peek();
                st.pop();
                st.push(sum);
            } else if (token.equals("-") && !st.isEmpty()) { // order matter in - adn / operator
                int a = st.pop();
                int b = st.pop();

                st.push(b-a);

            } else if (token.equals("*") && !st.isEmpty()) {
                int mul = st.peek();
                st.pop();
                mul *= st.peek();
                st.pop();
                st.push(mul);

            } else if (token.equals("/") && !st.isEmpty()) {
                int a = st.pop();
                int b = st.pop();

                st.push(b/a);

            } else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.peek();
    }
}
