/*
 * Problem #3983: Subsequence After One Replacement
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 05/07/2026, 08:21:29
 * Link: https://leetcode.com/problems/subsequence-after-one-replacement/
 */

class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int n = s.length();
        int a = 0, b = 0;

        for(char c : t.toCharArray()){
            int x = a, y = b;

            if(b < n && s.charAt(b) == c) y++;
            if(a < n) y = Math.max(y, a + 1);

            if(a < n && s.charAt(a) == c)x++;

            a = x;
            b = y;

            if(a == n || b == n) return true;
        }

        return a == n || b == n;
        // int n = s.length(), i = 0, j = 0;
        // while(i < n && j < t.length()){
        //     if(s.charAt(i) == t.charAt(j)){
        //         i++;
        //         j++;
        //     }else if(i+1 < n){
        //         i++;
        //     }else{
        //         j++;
        //     }
        // }

        // if(i == n) return true;

        // i = j = 0;
        // boolean used = false;
        // while(i < n && j < t.length()){
        //     if(s.charAt(i) == t.charAt(j) || !used){
        //         if(s.charAt(i) != t.charAt(j)) used = true;
        //         i++;
        //         j++;
        //     }else j++;
        // }
        // return i == n;
    }
}
