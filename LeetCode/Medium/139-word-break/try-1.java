/*
 * Problem #139: Word Break
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 01/05/2026, 17:16:48
 * Link: https://leetcode.com/problems/word-break/
 */

class Solution {
    public static boolean solve(String temp, List<String> wordDict, int i, String s) {
        if (i >= wordDict.size()) {
            // check if temp == s or not
            if (s.equals(temp)) {
                return true;
            }
        }
        temp = temp + wordDict.get(i);
        if (solve(temp, wordDict, i, s))
            return true;
        ;
        temp = temp.substring(0, temp.length() - wordDict.get(i).length());
        if (solve(temp, wordDict, i + 1, s))
            return true;

        return false;
    }

private Boolean[] t;
    int n;

    public boolean wordBreak(String s, List<String> wordDict) {
        // make a combination of word using wordDict like all subset 
        // we can select multiple times in wordDict
        // String temp = "";
        // return solve(temp, wordDict, 0, s);

    //     // brute force
        // int n = s.length();
    //     String word = "";

    //     boolean found = true;

    //     for (int i = 0; i < n; i++) {
    //         word += s.charAt(i);

    //         boolean match = false;

    //         for (int j = 0; j < wordDict.size(); j++) {
    //             if (word.equals(wordDict.get(j))) {
    //                 match = true;
    //                 break;
    //             }
    //         }

    //         if (match) {
    //             word = "";
    //         }
    //     }

    //     if (!word.equals(""))
    //         return false; // leftover string means invalid
    //     return true;
    // }

    n = s.length();
        t = new Boolean[s.length()];
        return solve(s, 0, wordDict);
    }
    private boolean solve(String s, int idx, List<String> wordDict) {
        if (idx == n) {
            return true;
        }
        
        if (t[idx] != null) {
            return t[idx];
        }
        
        for (int endIdx = idx + 1; endIdx <= n; endIdx++) {
            
            String split = s.substring(idx, endIdx);
            
            if (wordDict.contains(split) && solve(s, endIdx, wordDict)) {
                return t[idx] = true;
            }
        }
        
        return t[idx] = false;
    }
}

