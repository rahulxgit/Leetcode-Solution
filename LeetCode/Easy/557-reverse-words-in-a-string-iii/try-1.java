/*
 * Problem #557: Reverse Words in a String III
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 19/06/2026, 20:07:18
 * Link: https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String parts[] = s.split(" ");
        StringBuilder word = new StringBuilder("");
        for(int i = 0; i < parts.length; i++){
            StringBuilder words = new StringBuilder(parts[i]);
            word = words;
            word.reverse().toString();
            sb.append(" ").append(word);
        }
        return sb.substring(1,sb.length()).toString();
    }
}
