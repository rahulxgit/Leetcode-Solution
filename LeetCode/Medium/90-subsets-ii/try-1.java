/*
 * Problem #90: Subsets II
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 27/04/2026, 12:50:26
 * Link: https://leetcode.com/problems/subsets-ii/
 */

class Solution {
    List<List<Integer>> temp = new  LinkedList<>();
    public  void solve(int nums[], int i, LinkedList<Integer> list){
        if(i >= nums.length){
            temp.add(new LinkedList<>(list));
            return;
        }
        list.add(nums[i]);  // take ith el and explore and leap of faith of recursion
        solve(nums, i+1, list);
        list.removeLast();
        
        int j = i;
        while(j + 1 < nums.length && nums[j] == nums[j+1]){
            j++;
        }
        solve(nums, j+1, list); // not take ith el and explore and leap of faith of recursion
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        LinkedList<Integer> list = new LinkedList<>();
        solve(nums, 0, list);
        return temp;
    }
}
