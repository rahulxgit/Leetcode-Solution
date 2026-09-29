/*
 * Problem #216: Combination Sum III
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 29/04/2026, 14:38:21
 * Link: https://leetcode.com/problems/combination-sum-iii/
 */

class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void solve(int nums[], int i, LinkedList<Integer> temp, int k, int n){
        if(i >= nums.length){
            // all temp sum equal to k
            int sum = 0;
            for(int x : temp){
                sum += x;
            }
            if(temp.size() == k && sum == n){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        temp.addFirst(nums[i]);
        solve(nums, i+1, temp, k, n);
        temp.remove();
        solve(nums, i+1, temp, k, n);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        LinkedList<Integer> temp = new LinkedList<>();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        // Arrays.sort(); //for unique subset
        solve(nums, 0, temp, k, n);
        return ans;
    }
}
