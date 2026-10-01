/*
 * Problem #3963: Create Grid With Exactly One Path
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 20/06/2026, 20:30:41
 * Link: https://leetcode.com/problems/create-grid-with-exactly-one-path/
 */

class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];

        if (m == 1) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append('.');

            }
            ans[0] = sb.toString();
            return ans;
        }
        if (n == 1) {
            for (int i = 0; i < m; i++) {
                ans[i] = ".";
            }
            return ans;
        }

        for (int i = 0; i < m; i++) {
            char[] r = new char[n];

            for (int j = 0; j < n; j++) {
                r[j] = '#';
            }

            if (i == 0) {
                for (int j = 0; j < n; j++) {
                    r[j] = '.';
                }
            } else {
                r[n - 1] = '.';
            }
            ans[i] = new String(r);
        }

        return ans;
    }
}
