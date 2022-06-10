package io.datastructures.mentalmodels.search;

/**
 *  Given a 2D grid containing 'X' and 'O' capture all regions sorrounded by
 *  'X'
 *  A region is captured by flipping all 'O's into 'X' in that sorrounded region.
 */
public class SorroundedRegions {

    final char X = 'X';
    final char O = 'O';
    final char temp = '1';
    char[][] arr;

    public static void main(String[] args) {
        char[][] grid = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
        };
    }

    public void solve(char[][] board) {

         if (board == null || board.length == 0)
             return;
         arr = board;
         int m = board.length, n = board[0].length;
         // scan through the top & bottom rows
         for (int i=0; i < n; i++) {
             // top row
             if (board[0][i] == O) {
                 dfs(0, i);
             }
             // bottom row
             if (board[m-1][i] == O) {
                 dfs(m-1, i);
             }
         }
         // scan through left to right
        for (int i = 0; i < m; i++) {
            if (board[i][0] == O) {
                dfs(i, 0);
            }
            if (board[i][n-1] == O) {
                dfs(i, n-1);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == O) {
                    board[i][j] = X;
                }
                if (board[i][j] == temp) {
                    board[i][j] = O;
                }
            }
        }
    }

    private void dfs(int row, int col) {

        if (row < 0 || row >= arr.length || col < 0 || col >= arr[0].length)
            return;
        if (arr[row][col] != O) return;

        arr[row][col] = temp;

        dfs(row + 1, col);
        dfs(row - 1, col);
        dfs(row, col + 1);
        dfs(row, col - 1);
    }
}
