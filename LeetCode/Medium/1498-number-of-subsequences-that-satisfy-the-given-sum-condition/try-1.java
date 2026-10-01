/*
 * Problem #1498: Number of Subsequences That Satisfy the Given Sum Condition
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 27/04/2026, 16:15:34
 * Link: https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/
 */

class Solution {
    LinkedList<Integer> temp = new LinkedList<>();

    public int solve(int nums[], int i, LinkedList<Integer> list, int sum, int target, int count) {
        if (i >= nums.length) {
            // temp.add(new LinkedList<>(list));
            // temp.add(list);
            sum = list.getFirst() + list.getLast();
            if (sum == target) {
                count++;
            }
            return count;
        }

        list.add(nums[i]); // take ith el
        sum = list.getFirst() + list.getLast();
        if (sum == target) {
            count++;
        }
        solve(nums, i + 1, list, sum, target, count);

        list.removeLast(); // not take ith el
        // remove dupliacte
        // int j = i;
        // while(j+1 < nums.length && nums[j] == nums[j+1]){
        //     j++;
        // }
        sum = list.peekFirst() + list.getLast();
        if (sum == target) {
            count++;
        }
        solve(nums, i + 1, list, sum, target, count);

        return count;
    }

    public int numSubseq(int[] nums, int target) {
        // foall find all subsequence like leetcode subsetII problem
        // LinkedList<Integer> list = new LinkedList<>();

        // return solve(nums, 0, list, 0, target, 0);
        int M = (int)1e9+7;
        Arrays.sort(nums);  //sorting
        int n = nums.length;
        int l = 0, r = n - 1;

        int pow[] = new int[n];
        pow[0] = 1; //2^1 = 0;

        for(int i = 1; i < n; i++){
            pow[i] = (pow[i-1] * 2) % M;
        }

         int result = 0;
        while (l <= r) {
            if (nums[l] + nums[r] <= target) {
                int diff = r - l;
                result = (result % M + pow[diff]) % M; 
                // Math.pow givex TLE and use precompute power because its give out of range answer for some test cases so take modulo
                l++; 
            }else{
                r--;
            }
        }
        return result;
    }
}
