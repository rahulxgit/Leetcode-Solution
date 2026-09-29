/*
 * Problem #861: Score After Flipping Matrix
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 21/05/2026, 15:44:22
 * Link: https://leetcode.com/problems/score-after-flipping-matrix/
 */

class Solution {
    public int matrixScore(int[][] grid) {
        // brute force
        int m = grid.length;
        int n = grid[0].length;
        // row wise toggle
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) {
                // toggle
                for (int j = 0; j < n; j++) {
                    // if(grid[i][j]  == 1){
                    //     grid[i][j] = 0;
                    // }else{
                    //     grid[i][j] = 1;
                    // }
                    grid[i][j] ^= 1;
                }
            }
        }
        // col wise toggle
        for (int j = 1; j < n; j++) {
            int zeroCount = 0;
            for (int i = 0; i < m; i++) {
                if (grid[i][j] == 0) {
                    zeroCount++;
                }
            }
            if (zeroCount > (m / 2)) {
                for (int i = 0; i < m; i++) {
                    grid[i][j] ^= 1;
                }
            }
        }
        // compute score of grid
        int sum = 0;
        for (int i = 0; i < m; i++) {
            int rowValue = 0;
            for (int j = 0; j < n; j++) {
                rowValue = rowValue * 2 + grid[i][j];
            }
            sum += rowValue;
        }
        return sum;
    }
}
