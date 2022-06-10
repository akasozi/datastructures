package io.datastructures.mentalmodels.search;

import java.util.HashSet;
import java.util.Set;

/**
 * As you traverse each island, store the difference between the current coordinate and a base coordinate
 * in a string, at the end add this to a Hashset!
 */
public class NumDistinctIslands {

    int[][] grid;
    int baseRow;
    int baseCol;
    final int WATER = 0, LAND = 1;

    public static void main(String[] args) {
        int[][] grid = {
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,0,1,1},
                {0,0,0,1,1},
        };
        NumDistinctIslands obj = new NumDistinctIslands();
        int ans = obj.numDistinctIslands(grid);
        System.out.println("Answer: " + ans);
    }

    public int numDistinctIslands(int[][] grid) {
        this.grid = grid;
        int m = grid.length, n = grid[0].length;
        Set<String> set = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == WATER) continue;
                StringBuilder sb = new StringBuilder();
                baseRow = i;
                baseCol = j;
                dfs(i, j, sb);
                set.add(sb.toString());
            }
        }
        return set.size();
    }

    public void dfs(int row, int col, StringBuilder sb) {
        // check bounds
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) return;
        // check if water
        if (grid[row][col] == WATER)
            return;

        sb.append(row - baseRow);
        sb.append(col - baseCol);
        // sink the island
        grid[row][col] = WATER;
        // dfs
        dfs(row + 1, col, sb);
        dfs(row - 1, col, sb);
        dfs(row, col + 1, sb);
        dfs(row, col - 1, sb);
    }
}
