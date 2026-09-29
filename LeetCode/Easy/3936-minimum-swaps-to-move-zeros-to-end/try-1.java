/*
 * Problem #3936: Minimum Swaps to Move Zeros to End
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 23/05/2026, 20:23:34
 * Link: https://leetcode.com/problems/minimum-swaps-to-move-zeros-to-end/
 */

class Solution {
    public int minimumSwaps(int[] nums) {
        int countof0 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                countof0++;
            }
        }
        int count = 0;
        for(int i = nums.length - countof0; i < nums.length; i++){
            if(nums[i] != 0){
                count++;
            }
        }
        return count;
    }
}
