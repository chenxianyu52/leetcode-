class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int len = grid.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j || (len - 1 - i) == j) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else {
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }

            }
        }
        return true;

    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了35.34% 的Java用户
 * 内存消耗:42.2 MB,击败了62.25% 的Java用户
 */