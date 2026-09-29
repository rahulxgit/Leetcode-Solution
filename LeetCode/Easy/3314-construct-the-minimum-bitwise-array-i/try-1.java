/*
 * Problem #3314: Construct the Minimum Bitwise Array I
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 01/06/2026, 14:40:11
 * Link: https://leetcode.com/problems/construct-the-minimum-bitwise-array-i/
 */

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        //  most brute force worst tc
        int n = nums.size();
        int output[] = new int[n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= nums.get(i); j++){
                if((j | (j+1)) == nums.get(i)){
                    output[i] = j;
                    break;
                }else{
                    output[i] = -1;
                }
            }
        }
        return output;
    }
}
