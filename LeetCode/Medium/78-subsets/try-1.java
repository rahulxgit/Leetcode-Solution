/*
 * Problem #78: Subsets
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 26/04/2026, 18:11:15
 * Link: https://leetcode.com/problems/subsets/
 */

class Solution {
    public static void recursion(List<List<Integer>> ans, LinkedList<Integer> list, int i, int nums[], int n) {
        // base case
        if (i >= n) {
            // add all list in another LL
            ans.add(new LinkedList<>(list));
            // ans.add(list);
            return;
        }

        // recursion either choose or not(option slect)
        // choose 
        list.add(nums[i]);
        recursion(ans, list, i + 1, nums, n);

        // backtrack
        list.removeLast();
        
        // not choose
        // list.add();
        recursion(ans, list, i + 1, nums, n);
    }

    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>(); //empty list
        List<List<Integer>> ans = new LinkedList<>();
        recursion(ans, list, 0, nums, nums.length);

        return ans;
    }
}
