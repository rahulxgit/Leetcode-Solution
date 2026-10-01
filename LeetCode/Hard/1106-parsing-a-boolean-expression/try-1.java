/*
 * Problem #1106: Parsing A Boolean Expression
 * Difficulty: Hard
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 24/06/2026, 18:59:28
 * Link: https://leetcode.com/problems/parsing-a-boolean-expression/
 */

class Solution {

    private char solveOperator(StringBuilder sb, char op) {

        if (op == '!') {
            return sb.charAt(0) == 't' ? 'f' : 't';
        }

        if (op == '&') {
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == 'f') {
                    return 'f';
                }
            }
            return 't';
        }

        // op == '|'
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 't') {
                return 't';
            }
        }
        return 'f';
    }

    public boolean parseBoolExpr(String expression) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            if (ch == ',') continue;

            if (ch == ')') {

                StringBuilder sb = new StringBuilder();

                while (st.peek() != '(') {
                    sb.append(st.pop());
                }

                st.pop(); // remove '('

                char operator = st.pop();

                st.push(solveOperator(sb, operator));

            } else {
                st.push(ch);
            }
        }

        return st.pop() == 't';
    }
}
