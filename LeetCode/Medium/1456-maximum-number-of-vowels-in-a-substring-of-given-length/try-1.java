/*
 * Problem #1456: Maximum Number of Vowels in a Substring of Given Length
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 30/09/2026, 16:51:37
 * Link: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
 */

class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int max_count = 0;
        int curr_count = 0;
        // int i = 0;
        // while(i <= s.length() - k){
        for (int j = 0; j < n; j++) {
            char ch = s.charAt(j);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                curr_count++;
            }
            if (j >= k) {
                char ch1 = s.charAt(j - k);
                if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
                    curr_count--;
                }
            }
            max_count = Math.max(max_count, curr_count);
        }

        // curr_count = 0;
        // i++;
        // }

        return max_count;
    }
}
