/*
 * Problem #51: N-Queens
 * Difficulty: Hard
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 29/04/2026, 18:56:55
 * Link: https://leetcode.com/problems/n-queens/
 */

class Solution {
    List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2 * n - 1]; // row - col + (n-1)
        boolean[] diag2 = new boolean[2 * n - 1]; // row + col

        solve(board, 0, n, cols, diag1, diag2);
        return result;
    }

    public void solve(char[][] board, int row, int n,
                      boolean[] cols, boolean[] diag1, boolean[] diag2) {

        if (row == n) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {

            int d1 = row - col + (n - 1);
            int d2 = row + col;

            if (cols[col] || diag1[d1] || diag2[d2]) continue;

            // place queen
            board[row][col] = 'Q';
            cols[col] = true;
            diag1[d1] = true;
            diag2[d2] = true;

            solve(board, row + 1, n, cols, diag1, diag2);

            // backtrack
            board[row][col] = '.';
            cols[col] = false;
            diag1[d1] = false;
            diag2[d2] = false;
        }
    }

    public List<String> construct(char[][] board) {
        List<String> temp = new ArrayList<>();
        for (char[] row : board) {
            temp.add(new String(row));
        }
        return temp;
    }
}
