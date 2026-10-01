/*
 * Problem #242: Valid Anagram
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 04/12/2025, 19:45:10
 * Link: https://leetcode.com/problems/valid-anagram/
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        //length check
        if(s.length() != t.length()){
            return false;
        }
        //optimal approach = matched of freq of char
        int freq[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            char chs = s.charAt(i);
            freq[chs - 'a']++;
            
            char cht = t.charAt(i);
            freq[cht - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}
