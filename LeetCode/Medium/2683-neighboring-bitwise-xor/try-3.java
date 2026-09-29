/*
 * Problem #2683: Neighboring Bitwise XOR
 * Difficulty: Medium
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 30/05/2026, 13:55:11
 * Link: https://leetcode.com/problems/neighboring-bitwise-xor/
 */

class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        // // use xor propertes -> a ^ b = c then a ^ c = b or b ^c = a;
        // int n = derived.length;
        // int original[] = new int[derived.length];
        // original[0] = 0;  // let assume
        // for(int i = 1; i < derived.length; i++){
        //     original[i] = derived[i-1] ^ original[i-1];
        // }
        // if((original[0] == 0) && derived[derived.length - 1] == (original[derived.length - 1] ^ original[0])){
        //     return true;
        // }


        // original[0] = 1;  // let assume
        // for(int i = 1; i < derived.length; i++){
        //     original[i] = derived[i-1] ^ original[i-1];
        // }
        // if((original[0] == 1) && derived[derived.length - 1] == (original[derived.length - 1] ^ original[0])){
        //     return true;
        // }


        // return false;  //tc and sc = O(n)

        // 2nd approach
        int xor = 0;
        for(int num : derived){
            xor ^= num;
        }
        return xor == 0; // tc = O(n), sc = O(1);
    }
}
