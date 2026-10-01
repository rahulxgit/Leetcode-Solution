/*
 * Problem #3612: Process String with Special Operations I
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 17/06/2026, 00:40:07
 * Link: https://leetcode.com/problems/process-string-with-special-operations-i/
 */

class Solution {
    public String processStr(String s) {
        // remove last char by using - subString and stringBuilder via .toString
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '*' ){
                // result.toString() = result.toString().subString(0, result.toString().length() - 1);
                if(result.toString().length() == 0) continue;

                result.deleteCharAt(result.length() - 1);
            }else if(ch == '#' ){
                result.append(result);
            }else if(ch == '%'){
                result.reverse();
            }else{
                result.append(ch);
            }
        }
        return result.toString();
    }
}
