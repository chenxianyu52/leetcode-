class Solution {
    public int minPathSum(int[][] grid) {
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int[][] dp = new int[rowLength][colLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                dp[i][j] = grid[i][j];
                if (i == 0 && j == 0) {
                    continue;
                }
                int left = Integer.MAX_VALUE;
                int top = Integer.MAX_VALUE;
                if (i - 1 >= 0) {
                    top = dp[i - 1][j];
                }
                if (j - 1 >= 0) {
                    left = dp[i][j - 1];
                }

                dp[i][j] += Math.min(left, top);
            }
        }
        return dp[rowLength - 1][colLength - 1];
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了18.67% 的Java用户
 * 内存消耗:43.1 MB,击败了14.22% 的Java用户
 */