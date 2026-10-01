/*
 * Problem #1189: Maximum Number of Balloons
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 22/06/2026, 21:26:05
 * Link: https://leetcode.com/problems/maximum-number-of-balloons/
 */

class Solution {
    public int maxNumberOfBalloons(String text) {
        // hash  map or hash set or freq array  0R using sorting
        // there are another way to solve this question must learn
        // hashmap implementation
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < text.length(); i++){
            if(map.containsKey(text.charAt(i))){  // only change in freq

            map.put(text.charAt(i), map.get(text.charAt(i)) +  1);

            }else{
                map.put(text.charAt(i), 1);
            }
        }
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for (char key : map.keySet()) {
            if (key == 'b') {
                b = map.get(key);
            } else if (key == 'a') {
                a = map.get(key);
            } else if (key == 'l') {
                l = map.get(key) / 2;
            } else if (key == 'o') {
                o = map.get(key) / 2;
            } else if (key == 'n') {
                n = map.get(key);
            }
        }

        return Math.min(b,
                Math.min(a,
                Math.min(l,
                Math.min(o, n))));
    }
}
