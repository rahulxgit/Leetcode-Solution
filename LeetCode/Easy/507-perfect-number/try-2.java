/*
 * Problem #507: Perfect Number
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 02/06/2026, 16:51:58
 * Link: https://leetcode.com/problems/perfect-number/
 */

class Solution {
    public boolean checkPerfectNumber(int num) {
        // find all divisor using bit

        // find all divisor using brute force
        int sum = 0;
        for(int i = 1; i <= num / 2; i++){
            if((num % i) == 0){
                sum += i;
            }
        }
        return (sum == num);
    }
}
