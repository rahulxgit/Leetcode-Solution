/*
 * Problem #1344: Angle Between Hands of a Clock
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 18/06/2026, 20:20:15
 * Link: https://leetcode.com/problems/angle-between-hands-of-a-clock/
 */

class Solution {
    public double angleClock(int hour, int minutes) {

        double angleDByH = (hour % 12) * 30 + minutes * 0.5;

        double angleCByM = minutes * 6;

        double diff = Math.abs(angleCByM - angleDByH);

        return Math.min(diff, 360 - diff);
    }
}
