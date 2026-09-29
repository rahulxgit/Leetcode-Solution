/*
 * Problem #3701: Compute Alternating Sum
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 05/10/2025, 08:27:59
 * Link: https://leetcode.com/problems/compute-alternating-sum/
 */

class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0; //Loop thru each index and element of the array
        for(int i = 0; i < nums.length; i++){
            //if idx is even, add the el; odd- sub the el
            if(i % 2 ==0){
                sum += nums[i];
            }else{
                sum -= nums[i];
            }
        }
        return sum; //complete alternating sum
    }
}
