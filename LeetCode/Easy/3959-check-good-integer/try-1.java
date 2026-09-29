/*
 * Problem #3959: Check Good Integer
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 14/06/2026, 08:06:08
 * Link: https://leetcode.com/problems/check-good-integer/
 */

class Solution {
    public boolean checkGoodInteger(int n) {
        int digiSum = 0;
        int sqSum = 0;
        while(n != 0){
            int rem = n % 10;
            digiSum += rem;
            sqSum += rem * rem;
            n = n / 10;
        }
        return (sqSum - digiSum ) >= 50;
    }
}
