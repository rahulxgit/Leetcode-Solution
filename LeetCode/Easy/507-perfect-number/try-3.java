/*
 * Problem #507: Perfect Number
 * Difficulty: Easy
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 02/06/2026, 17:18:14
 * Link: https://leetcode.com/problems/perfect-number/
 */

class Solution {
    public boolean checkPerfectNumber(int num) {
        // find all divisor using bit

        // // find all divisor using brute force
        // int sum = 0;
        // for(int i = 1; i*i <= num; i++){
        //     if((num % i) == 0){
        //         sum += i;
        //     }
        // }
        // return (sum == num);

        return num == 6 ||
                num == 28 ||
                num == 496 ||
                num == 8128 ||
                num == 33550336;
    }
}
