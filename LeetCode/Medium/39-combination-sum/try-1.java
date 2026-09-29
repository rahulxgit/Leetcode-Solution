/*
 * Problem #39: Combination Sum
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 28/04/2026, 14:25:05
 * Link: https://leetcode.com/problems/combination-sum/
 */

class Solution {
    List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> solve(int[] candidates, LinkedList<Integer> temp, int i, int target){
        int sum = 0;
            for(int x : temp){
                sum += x;
            }
        // base case
        if(i >= candidates.length){
            if(sum == target){
                result.add(new LinkedList<>(temp));  //This creates a new copy of temp and stores it. and A separate LinkedList object is created
                // result.add(temp);   // This stores the reference (address) of the same temp list. // No new list is created
            }
            return result;
        }
        if(sum > target) return result;
        // recursion if ith el take
        temp.addFirst(candidates[i]);
        solve(candidates, temp, i, target);

        temp.removeFirst();  //is ith el not take
        solve(candidates, temp, i+1, target);

        return result;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // find all subset
        // GIVEN IN QUESTION - The same number may be chosen from candidates an unlimited number of times.
        LinkedList<Integer> temp = new LinkedList<>();
        return solve(candidates, temp, 0, target);
    }
}
