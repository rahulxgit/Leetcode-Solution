/*
 * Problem #796: Rotate String
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 03/04/2026, 13:42:43
 * Link: https://leetcode.com/problems/rotate-string/
 */

class Solution {
    public boolean rotateString(String s, String goal) {
        // rotate(left) by 1 and cpmpare goal to each time return true
        // rotate slength time each by 1
        int n = s.length();

        // s.charAt(i) = s.charAt(i + 1);  we can not modify on charAt

        // convert into charArray
        char ch[] = s.toCharArray();

        for (int j = 0; j < n; j++) {
            // just one left rotation
            char temp = ch[0]; // store first element

            for (int i = 0; i < n - 1; i++) {
                ch[i] = ch[i + 1];
            }

            ch[n - 1] = temp; // put first element at last
            String st = new String(ch);
            // compare it
            if (st.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
