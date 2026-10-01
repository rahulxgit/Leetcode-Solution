/*
 * Problem #169: Majority Element
 * Difficulty: Easy
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 07/03/2026, 00:41:58
 * Link: https://leetcode.com/problems/majority-element/
 */

import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        // optimal approach hashmap
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            // store and update frequency
            if(mp.containsKey(nums[i])){
                mp.put(nums[i], mp.get(nums[i]) + 1);
            }else{
                mp.put(nums[i], 1);
            }
        }

        int n = nums.length;

        // loop on map
        for(int key : mp.keySet()){
            if(mp.get(key) > n/2){
                return key;
            }
        }

        return -1;
    }
}
