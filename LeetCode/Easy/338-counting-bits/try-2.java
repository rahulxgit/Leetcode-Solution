/*
 * Problem #338: Counting Bits
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 08/05/2026, 17:20:04
 * Link: https://leetcode.com/problems/counting-bits/
 */

class Solution {
    public int[] countBits(int n) {
        // return array of no of ones for each i for binary representation
        int arr[] = new int[n+1];
        // for(int i = 0; i <= n; i++){
        //     int count = 0;
        //     int no = i;
        //     while(no > 0){
        //         if((no & 1) == 1){
        //             count++;
        //         }
        //         no >>= 1;
        //     }
        //     arr[i] = count;
        // }
        // return arr;

        if(n == 0){
            return arr;
        }
        arr[0] = 0;

        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                arr[i] = arr[i/2]+1;
            }else{
                arr[i] = arr[i/2];
            }
        }
        return arr;
    }
}
