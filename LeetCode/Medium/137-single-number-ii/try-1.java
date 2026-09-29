/*
 * Problem #137: Single Number II
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 08/05/2026, 14:53:17
 * Link: https://leetcode.com/problems/single-number-ii/
 */

class Solution {
    public int singleNumber(int[] nums) {
        // using hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
        // iterate in map
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}
