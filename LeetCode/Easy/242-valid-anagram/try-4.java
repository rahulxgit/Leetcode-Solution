/*
 * Problem #242: Valid Anagram
 * Difficulty: Easy
 * Submission: Try 4
 * status: Accepted
 * Language: java
 * Date: 03/04/2026, 14:16:21
 * Link: https://leetcode.com/problems/valid-anagram/
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        // by frequency array
        if(s.length() != t.length()){
            return false;
        }
        int  freq_array[] = new int[26];

        // store in freq array
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq_array[ch - 'a']++;  //taki 1 t0 26 tak ho
        }

        // delete in freq array
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            freq_array[ch - 'a']--;
        }
        // freq array must empty

        for(int i = 0; i < freq_array.length; i++){
            if(freq_array[i] != 0){
                return false;
            }
        }
        return true;
    }
}
