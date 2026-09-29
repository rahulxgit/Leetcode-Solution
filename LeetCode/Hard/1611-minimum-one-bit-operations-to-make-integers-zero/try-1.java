/*
 * Problem #1611: Minimum One Bit Operations to Make Integers Zero
 * Difficulty: Hard
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/05/2026, 15:51:52
 * Link: https://leetcode.com/problems/minimum-one-bit-operations-to-make-integers-zero/
 */

class Solution {
    public int minimumOneBitOperations(int n) {
        if(n == 0) return 0;

        long function[] = new long[32];
        function[0] = 1;
        for(int i = 1; i <= 31; i++){
            function[i] = 2*function[i-1]+1;
        }

        int result = 0;
        int sign = 1;

        for(int i = 31; i >= 0; i--){  // solve left to right
     
            int ith_bit = ((1 << i) & n);

            if(ith_bit == 0){
                continue;
            }

            if(sign > 0){
                result += function[i];
            }else{
                result -= function[i];
            }

            sign = sign*(-1);
        }
        return result;
    }
}
