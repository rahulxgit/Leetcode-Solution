/*
 * Problem #3315: Construct the Minimum Bitwise Array II
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 01/06/2026, 16:05:39
 * Link: https://leetcode.com/problems/construct-the-minimum-bitwise-array-ii/
 */

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        //  most brute force worst tc = O(n*1000)

    
        int n = nums.size();
        int output[] = new int[n];

        for(int i = 0; i < n; i++){
            int x = nums.get(i);
            boolean found = false;


            if(nums.get(i) == 2){
                output[i] = -1;
                continue;
            }
            
            for(int j = 0; j < 31; j++){
                
                if((x & (1 << j)) > 0){
                    continue;
                }

                //special check for even number or 2
                int prevBit = j - 1; // make prevBit zero
                x ^= (1 << prevBit);


                output[i] = x;
                found = true;
                break;
            }
            if(!found){
                output[i] = -1;
            }
        }
        return output;
    }
}
