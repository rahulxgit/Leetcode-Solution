/*
 * Problem #946: Validate Stack Sequences
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/06/2026, 15:53:27
 * Link: https://leetcode.com/problems/validate-stack-sequences/
 */

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st1 = new Stack<>();
        // Stack<Integer> st2 = new Stack<>();

        // for (int i = 0; i < pushed.length; i++) {
        //     int j = 0;
        //     if (!st1.isEmpty() && st1.peek() == popped[j]) {
        //         st2.push(st1.peek());
        //         st1.pop();
        //         j++;
        //     } else {
        //         st1.push(pushed[i]);
        //     }

        // }

        // // comparision b/w popped and st2
        // for (int i = popped.length - 1; i >= 0; i--) {
        //     if (!st2.isEmpty() && popped[i] == st2.peek()) {
        //         st1.pop();
        //     } else {
        //         return false;
        //     }
        // }
        // return true;

        // 2nd method optimal
        int j = 0;
        for (int x : pushed) {

            st1.push(x);

            while (!st1.isEmpty() && j < popped.length && st1.peek() == popped[j]) {

                st1.pop();
                j++;
            }
            // else {
            //     st1.push(x);
            // }
        }
        return st1.isEmpty();
    }
}
