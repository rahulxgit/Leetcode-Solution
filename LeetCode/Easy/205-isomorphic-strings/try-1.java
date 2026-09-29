/*
 * Problem #205: Isomorphic Strings
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 02/04/2026, 20:31:41
 * Link: https://leetcode.com/problems/isomorphic-strings/
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        // edge case
        if(n1 != n2){
            return false;
        }

        for(int i = 0; i < n1; i++){
            for(int j = i + 1; j < n1; j++){
                // same character in s
                if(s.charAt(i) == s.charAt(j)){
                    if(t.charAt(i) != t.charAt(j)){
                        return false;
                    }
                }

                else{
                    // different character in s
                    if(t.charAt(i) == t.charAt(j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
