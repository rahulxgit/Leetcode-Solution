/*
 * Problem #242: Valid Anagram
 * Difficulty: Easy
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 03/04/2026, 14:15:56
 * Link: https://leetcode.com/problems/valid-anagram/
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        // by frequency array
        
        int  freq_array[] = new int[26];
        if(s.length() != t.length()){
            return false;
        }

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
