class Solution {
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    result += dfs(grid, i, j);
                }
            }
        }
        return result;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length) {
            return 1;
        }
        if (j < 0 || j >= grid[0].length) {
            return 1;
        }

        if (grid[i][j] == 0) {
            return 1;
        }

        if (grid[i][j] != 1) {
            return 0;
        }

        grid[i][j] = 2;
        return dfs(grid, i - 1, j) + dfs(grid, i, j - 1) + dfs(grid, i, j + 1) + dfs(grid, i + 1, j);
    }
}
/**
 * 解答成功:
 * 执行耗时:7 ms,击败了52.14% 的Java用户
 * 内存消耗:43 MB,击败了19.21% 的Java用户
 */