/*
 * Problem #74: Search a 2D Matrix
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 01/04/2026, 15:28:56
 * Link: https://leetcode.com/problems/search-a-2d-matrix/
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; // row
        int n = matrix[0].length; // col

        // iterate ot tranverse in row
        for (int i = 0; i < m; i++) {
            //iterate ot tranverse in col
            int l = 0;
            int r = n-1;

            while (l <= r) {
                int mid = l + (r - l) / 2;
                if(matrix[i][mid] == target){
                    return true;
                }else if(matrix[i][mid] < target){
                    // search on right
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }
        }
        return false;
    }
}
