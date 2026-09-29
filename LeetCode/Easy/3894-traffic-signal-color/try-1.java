/*
 * Problem #3894: Traffic Signal Color
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/04/2026, 21:12:55
 * Link: https://leetcode.com/problems/traffic-signal-color/
 */

class Solution {
    public String trafficSignal(int timer) {
        if(timer ==0){
            return "Green";
        }else if(timer == 30){
            return "Orange";
        }else if(timer > 30 && timer <= 90){
            return "Red";
        }else{
            return "Invalid";
        }
    }
}
