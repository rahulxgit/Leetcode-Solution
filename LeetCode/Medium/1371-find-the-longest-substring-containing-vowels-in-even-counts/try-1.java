/*
 * Problem #1371: Find the Longest Substring Containing Vowels in Even Counts
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 26/05/2026, 13:57:35
 * Link: https://leetcode.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/
 */

class Solution {
    public int findTheLongestSubstring(String s) {

        // // int vowelArr[] = new int[5];
        // int maxLen = 0;

        // for(int i = 0; i < s.length(); i++){
        //     int vowelArr[] = new int[5];
        //     int c = 0;
        //     for(int j = i; j < s.length(); j++){
        //         if(s.charAt(j) == 'a'){
        //             vowelArr[0]++;
        //             c++;
        //         }else if(s.charAt(j) == 'e'){
        //             vowelArr[1]++;
        //             c++;
        //         }else if(s.charAt(j) == 'i'){
        //             vowelArr[2]++;
        //             c++;
        //         }else if(s.charAt(j) == 'o'){
        //             vowelArr[3]++;
        //             c++;
        //         }else if(s.charAt(j) == 'u'){
        //             vowelArr[4]++;
        //             c++;
        //         }
        //         // count vowel in vowel arr
        //         if(vowelArr[0] % 2 == 0 &&
        //            vowelArr[1] % 2 == 0 &&
        //            vowelArr[2] % 2 == 0 &&
        //            vowelArr[3] % 2 == 0 &&
        //            vowelArr[4] % 2 == 0){
        //             maxLen = Math.max(maxLen, j - i + 1);
        //         }

        //     }
        // }

        HashMap<Integer, Integer> map = new HashMap<>();

        int mask = 0; // 00000
        map.put(0,-1);

        int result = 0;
        for (int j = 0; j < s.length(); j++) {

            if (s.charAt(j) == 'a') {
                mask = (mask ^ (1 << 0));
            } else if (s.charAt(j) == 'e') {
                mask = (mask ^ (1 << 1));
            } else if (s.charAt(j) == 'i') {
                mask = mask ^ (1 << 2);
            } else if (s.charAt(j) == 'o') {
                mask = mask ^ (1 << 3);
            } else if (s.charAt(j) == 'u') {
                mask = mask ^ (1 << 4);
            }

            if(map.containsKey(mask)){
                result = Math.max(result, j - map.get(mask));
            }else{
                map.put(mask, j);
            }

        }

        return result;
    }
}
