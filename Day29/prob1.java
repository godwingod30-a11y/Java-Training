class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numIslands = 0;
        int m = grid.length;
        int n = grid[0].length;

        // Traverse the entire grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If we find land, we found an island
                if (grid[i][j] == '1') {
                    numIslands++;
                    // Run DFS to sink the entire island
                    dfs(grid, i, j, m, n);
                }
            }
        }

        return numIslands;
    }

    private void dfs(char[][] grid, int i, int j, int m, int n) {
        // Base case: Check if we are out of bounds or at water ('0')
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
            return;
        }

        // Mark the current land as visited by turning it into water
        grid[i][j] = '0';

        // Recursively visit all 4 adjacent directions (up, down, left, right)
        dfs(grid, i - 1, j, m, n); // Up
        dfs(grid, i + 1, j, m, n); // Down
        dfs(grid, i, j - 1, m, n); // Left
        dfs(grid, i, j + 1, m, n); // Right
    }
}