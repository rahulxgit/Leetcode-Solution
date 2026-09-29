/*
 * Problem #861: Score After Flipping Matrix
 * Difficulty: Medium
 * Submission: Try 4
 * status: Accepted
 * Language: java
 * Date: 21/05/2026, 16:17:32
 * Link: https://leetcode.com/problems/score-after-flipping-matrix/
 */

class Solution {
    public int matrixScore(int[][] grid) {
        // // brute force
        int m = grid.length;
        int n = grid[0].length;


        // // row wise toggle
        // for (int i = 0; i < m; i++) {
        //     if (grid[i][0] == 0) {
        //         // toggle
        //         for (int j = 0; j < n; j++) {
        //             // if(grid[i][j]  == 1){
        //             //     grid[i][j] = 0;
        //             // }else{
        //             //     grid[i][j] = 1;
        //             // }
        //             grid[i][j] ^= 1;
        //         }
        //     }
        // }



        // // col wise toggle
        // for (int j = 1; j < n; j++) {
        //     int zeroCount = 0;
        //     for (int i = 0; i < m; i++) {
        //         if (grid[i][j] == 0) {
        //             zeroCount++;
        //         }
        //     }
        //     if (zeroCount > (m / 2)) {
        //         for (int i = 0; i < m; i++) {
        //             grid[i][j] ^= 1;
        //         }
        //     }
        // }
        // // compute score of grid
        // int sum = 0;
        // for (int i = 0; i < m; i++) {
        //     // int rowValue = 0;
        //     // for (int j = 0; j < n; j++) {
        //     //     rowValue = rowValue * 2 + grid[i][j];
        //     // }
        //     // sum += rowValue;
        //     for (int j = 0; j < n; j++) {
        //         int value = grid[i][j] * (int)Math.pow(2, n - j -1);
        //         sum += value;
        //     }
        // }
        // return sum;  // tc = O(m*n)

        int res = m * (int)Math.pow(2, n-1);
        for(int j =1; j < n; j++){
            int c = 0;
            for(int i = 0; i < m; i++){
                if(grid[i][j] == grid[i][0]){
                    c++;
                }
            }

            int c1 = c;
            int c0 = m - c1;

            int o = Math.max(c1, c0);

            res += (Math.pow(2, n - j -1) * o);
        }
        return res;
    }
}
