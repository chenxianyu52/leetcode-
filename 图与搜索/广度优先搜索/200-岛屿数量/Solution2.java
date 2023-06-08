class Solution {
    int result = 0;

    public int numIslands(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dao(grid, i, j);
                    result++;
                }
            }
        }
        return result;
    }

    private void dao(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length) {
            return;
        }

        if (j < 0 || j >= grid[0].length) {
            return;
        }
        if (grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '2';
        dao(grid, i - 1, j);
        dao(grid, i + 1, j);
        dao(grid, i, j + 1);
        dao(grid, i, j - 1);
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了100.00% 的Java用户
 * 内存消耗:46.5 MB,击败了80.82% 的Java用户
 */