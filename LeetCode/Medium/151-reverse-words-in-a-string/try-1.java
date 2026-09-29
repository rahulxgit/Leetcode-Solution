/*
 * Problem #151: Reverse Words in a String
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 02/04/2026, 16:04:08
 * Link: https://leetcode.com/problems/reverse-words-in-a-string/
 */

class Solution {
    public String reverseWords(String s) {
         StringBuilder s1 = new StringBuilder(s);
         s1.reverse();
        //  split by space
        String reversed = s1.toString();
        String words[] = reversed.split("\\s++");  // make a  array which access word by index
        for(int i = 0; i < words.length; i++){
            StringBuilder w = new StringBuilder(words[i]);
            words[i] = w.reverse().toString();
        }
         return String.join(" ", words).trim();
    }
}
