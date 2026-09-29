/*
 * Problem #2840: Check if Strings Can be Made Equal With Operations II
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 30/03/2026, 22:29:54
 * Link: https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-ii/
 */

class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n = s1.length();

        int even[] = new int[26];
        int odd[] = new int[26];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even[s1.charAt(i) - 'a']++;
                even[s2.charAt(i) - 'a']--;
            } else {
                odd[s1.charAt(i) - 'a']++;
                odd[s2.charAt(i) - 'a']--;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (even[i] != 0 || odd[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
