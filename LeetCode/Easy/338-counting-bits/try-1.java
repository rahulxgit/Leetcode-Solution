/*
 * Problem #338: Counting Bits
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 08/05/2026, 16:23:15
 * Link: https://leetcode.com/problems/counting-bits/
 */

class Solution {
    public int[] countBits(int n) {
        // return array of no of ones for each i for binary representation
        int arr[] = new int[n+1];
        for(int i = 0; i <= n; i++){
            int count = 0;
            int no = i;
            while(no > 0){
                if((no & 1) == 1){
                    count++;
                }
                no >>= 1;
            }
            arr[i] = count;
        }
        return arr;
    }
}
