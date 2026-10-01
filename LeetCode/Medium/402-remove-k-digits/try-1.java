/*
 * Problem #402: Remove K Digits
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 16/06/2026, 22:18:19
 * Link: https://leetcode.com/problems/remove-k-digits/
 */

class Solution {
    public String removeKdigits(String num, int k) {
        // iterate over nums and delete when bigger value comes then peek of  stack till k becomes zero

        // edge case if nums is already sorted in inc order then k remain unchanged

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            
            // inc order mein dlna hai kyuki smallest no milaga
            while (k > 0 && !st.isEmpty() && st.peek() > digit) {
                st.pop();
                k--;
            }

            if (st.isEmpty() && digit == 0) {
                continue;
            }

            st.push(digit);

        }

        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        if (st.isEmpty()) {
            return "0";
        }

        // st --> string
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append((char) (st.pop() + '0'));
        }
        return sb.reverse().toString(); // tc - O(2n + k)  ans sc = O(n-k)
    }
}
