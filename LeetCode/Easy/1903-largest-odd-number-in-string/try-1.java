/*
 * Problem #1903: Largest Odd Number in String
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 02/04/2026, 17:19:00
 * Link: https://leetcode.com/problems/largest-odd-number-in-string/
 */

class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        // edge case if each number is even return ""
        // boolean found_odd = false;
        // for(int i = 0; i < n; i++){
        //     if(num.charAt(i) % 2 == 0){
        //         found_odd = true;
        //     }
        // }
        // if(!found_odd){
        //     return "";
        // }
        // find odd
        for(int i = n-1; i >= 0; i--){
            if((num.charAt(i) - '0') % 2 != 0){
                 return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
