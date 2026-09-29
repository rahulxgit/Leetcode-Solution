/*
 * Problem #13: Roman to Integer
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 03/04/2026, 16:51:43
 * Link: https://leetcode.com/problems/roman-to-integer/
 */

class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int ans = 0;

        for(int i = 0; i < n; i++){
            int curr = value(s.charAt(i));

            if(i < n - 1 && curr < value(s.charAt(i+1))){
                ans -= curr;
            } else {
                ans += curr;
            }
        }
        return ans;
    }

    public int value(char ch){
        if(ch == 'I') return 1;
        if(ch == 'V') return 5;
        if(ch == 'X') return 10;
        if(ch == 'L') return 50;
        if(ch == 'C') return 100;
        if(ch == 'D') return 500;
        return 1000; // M
    }
}
