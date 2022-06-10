package io.datastructures.mentalmodels.search;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class NumIslands {

    private boolean[][] visited;
    private char[][] grid;
    final char WATER = '0';
    final char LAND = '1';

    public static void main(String[] agrs) {
           char[][] grid = {
                     {'1', '1', '1', '1', '0'},
                     {'1', '1', '0', '1', '0'},
                     {'1', '1', '0', '0', '0'},
                     {'0', '0', '0', '0', '0'},
           };

           NumIslands numIslandsObject = new NumIslands();
           int count = numIslandsObject.numIslands(grid);
           System.out.println("Answer: " + count);
    }



    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        this.visited = new boolean[m][n];
        this.grid = grid;
        int counter = 0;

        for (int i = 0; i < m; i++) {
            for (int j=0; j < n; j++) {
                if (grid[i][j] == WATER || visited[i][j]) continue;
                counter++;
                dfs(i, j);
            }
        }
        return counter;
    }

    public void dfs(int row, int col) {
        // check bounds
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) return;

        // check if water
        if (grid[row][col] == WATER) return;

        // check if visited
        if (visited[row][col]) return;

        // mark this cell visited
        visited[row][col] = true;

        // DFS on all four directions
        dfs(row + 1, col); // down
        dfs(row - 1, col); // up
        dfs(row, col + 1); // right
        dfs(row, col - 1); // left
    }
}
