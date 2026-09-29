/*
 * Problem #907: Sum of Subarray Minimums
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 12/06/2026, 17:09:38
 * Link: https://leetcode.com/problems/sum-of-subarray-minimums/
 */

class Solution {

    public int[] NSL(int[] arr, int n) {
        int[] re = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            re[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return re;
    }

    public int[] NSR(int[] arr, int n) {
        int[] re = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            re[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return re;
    }

    public int sumSubarrayMins(int[] arr) {
        // // brute force loop
        // int sum = 0;
        // for(int i = 0; i < arr.length; i++){
        //     int min = arr[i];
        //     for(int j = i; j < arr.length; j++){
        //         min = Math.min(min, arr[j]);
        //         sum += min;
        //     }
        // }
        // return sum;  // tc  =(n^2) not good

        // satck  O(N)

        // Intituation  

        int n = arr.length;

        int[] left = NSL(arr, n);
        int[] right = NSR(arr, n);

        long sum = 0;
        int M = 1_000_000_007;

        for (int i = 0; i < n; i++) {
            long ls = i - left[i];
            long rs = right[i] - i;

            long totalWays = ls * rs;

            long totalSum = (arr[i] * totalWays) % M;

            sum = (sum + totalSum) % M;
        }

        return (int) sum;

    }
}
