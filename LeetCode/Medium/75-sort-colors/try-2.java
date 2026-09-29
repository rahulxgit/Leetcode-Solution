/*
 * Problem #75: Sort Colors
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 07/03/2026, 16:08:51
 * Link: https://leetcode.com/problems/sort-colors/
 */

import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){

            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }

            else if(nums[mid] == 1){
                mid++;
            }

            else{ // nums[mid] == 2
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    
    }
}
