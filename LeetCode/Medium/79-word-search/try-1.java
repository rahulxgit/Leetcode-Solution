/*
 * Problem #79: Word Search
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 29/04/2026, 18:14:23
 * Link: https://leetcode.com/problems/word-search/
 */

class Solution {
    int m, n;
    int[][] directions = {
            { 0, 1 }, // right
            { 0, -1 }, // left
            { 1, 0 }, // down
            { -1, 0 } // up
    };

    public boolean find(char[][] board, int i, int j, int idx, String word) {
        if (idx >= word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] == '$') {
            return false;
        }
        if (board[i][j] != word.charAt(idx))
            return false;

        //backtracking code
        char temp = board[i][j];
        board[i][j] = '$'; // visited

        for (int[] dir : directions) {
            int newRow = i + dir[0];
            int newCol = j + dir[1];

            if(find(board, newRow, newCol, idx+1, word)) return true;
        }
        board[i][j] = temp;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && find(board, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }
}
