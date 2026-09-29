/*
 * Problem #22: Generate Parentheses
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 24/04/2026, 17:52:57
 * Link: https://leetcode.com/problems/generate-parentheses/
 */

class Solution {
    public static void recursion(String s, int open, int close, int n, LinkedList<String> list) {
        // base case 
        if (s.length() == 2 * n) {
            list.add(s);
            return;
        }

        if (open < n) {
            recursion(s + '(', open + 1, close, n, list);
        }
        if (close < open) {
            recursion(s + ')', open, close + 1, n, list);
        }

        // backtracking for validation check
        // not must be pallindrome
    }

    public List<String> generateParenthesis(int n) {
        // code here
        // tree diagram recursion
        LinkedList<String> list = new LinkedList<>();
        String s = "";
        int open = 0;
        int close = 0;

        // recursion function
        recursion(s, open, close, n, list);
        return list;
    }
}
