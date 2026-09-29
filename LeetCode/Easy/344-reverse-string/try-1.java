/*
 * Problem #344: Reverse String
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 01/03/2026, 12:39:26
 * Link: https://leetcode.com/problems/reverse-string/
 */

class Solution {
    public void reverseString(char[] s) {
        // swap using two pointers
        int l = 0;
        int r = s.length -1;
        while(l < r){
            // swapping
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
        // // print array
        // for(int i = 0; i < s.lenght -1; i++){
        //     System.out.print(s[i]);
        // }

    }
}
