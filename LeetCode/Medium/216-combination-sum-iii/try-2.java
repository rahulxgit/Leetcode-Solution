/*
 * Problem #216: Combination Sum III
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 29/04/2026, 15:07:03
 * Link: https://leetcode.com/problems/combination-sum-iii/
 */

class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void solve(int nums[], int i, LinkedList<Integer> temp, int k, int n){
        if(temp.size() == k){
            if(n == 0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if(i >= nums.length || n < 0) return;
        temp.addFirst(nums[i]);
        solve(nums, i+1, temp, k, n - nums[i]);
        temp.remove();
        solve(nums, i+1, temp, k, n);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        LinkedList<Integer> temp = new LinkedList<>();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        // Arrays.sort(); //for unique subset
        int sum = 0;
        solve(nums, 0, temp, k, n);
        return ans;
    }
}
