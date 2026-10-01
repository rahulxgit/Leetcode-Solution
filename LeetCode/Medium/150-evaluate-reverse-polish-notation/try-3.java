/*
 * Problem #150: Evaluate Reverse Polish Notation
 * Difficulty: Medium
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 12/06/2026, 16:42:20
 * Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/
 */

import java.util.function.BiFunction;
class Solution {
    public int evalRPN(String[] tokens) {
        // split by comma and store in stack 
        // Stack<Integer> st = new Stack<>();
        // for (String token : tokens) {
        //     if (token.equals("+") && !st.isEmpty()) {
        //         int sum = st.peek();
        //         st.pop();
        //         sum += st.peek();
        //         st.pop();
        //         st.push(sum);
        //     } else if (token.equals("-") && !st.isEmpty()) { // order matter in - adn / operator
        //         int a = st.pop();
        //         int b = st.pop();

        //         st.push(b-a);

        //     } else if (token.equals("*") && !st.isEmpty()) {
        //         int mul = st.peek();
        //         st.pop();
        //         mul *= st.peek();
        //         st.pop();
        //         st.push(mul);

        //     } else if (token.equals("/") && !st.isEmpty()) {
        //         int a = st.pop();
        //         int b = st.pop();

        //         st.push(b/a);

        //     } else {
        //         st.push(Integer.parseInt(token));
        //     }
        // }
        // return st.peek();

        // using onorder mapMap<String, BiFunction<Integer, Integer, Integer>> op = new HashMap<>();
        Map<String, BiFunction<Integer, Integer, Integer>> op = new HashMap<>();
        op.put("+", (a, b) -> a + b);
        op.put("-", (a, b) -> a - b);
        op.put("*", (a, b) -> a * b);
        op.put("/", (a, b) -> a / b);

        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {

            if (op.containsKey(token)) {

                int b = st.pop();
                int a = st.pop();

                st.push(op.get(token).apply(a, b));

            } else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();

    }
}
